import api from './api';
import { Request, RequestDTO } from '../types';

export const getMyRequests = async () => {
  const response = await api.get('/requests/my');
  return response.data;
};

export const getAllRequests = async () => {
  const response = await api.get('/requests');
  return response.data;
};

export const createRequest = async (request: RequestDTO) => {
  const response = await api.post('/requests', request);
  return response.data;
};

export const updateRequest = async (id: string, request: RequestDTO) => {
  const response = await api.put(`/requests/${id}`, request);
  return response.data;
};

export const deleteRequest = async (id: string) => {
  const response = await api.delete(`/requests/${id}`);
  return response.data;
};