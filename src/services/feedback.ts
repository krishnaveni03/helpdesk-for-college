import api from './api';
import { Feedback } from '../types';

export const submitFeedback = async (feedback: Feedback) => {
  const response = await api.post('/feedback', feedback);
  return response.data;
};

export const getFeedback = async () => {
  const response = await api.get('/feedback');
  return response.data;
};