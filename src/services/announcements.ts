import api from './api';
import { Announcement } from '../types';

export const getAnnouncements = async () => {
  const response = await api.get('/announcements');
  return response.data;
};

export const createAnnouncement = async (announcement: Announcement) => {
  const response = await api.post('/announcements', announcement);
  return response.data;
};

export const updateAnnouncement = async (id: string, announcement: Announcement) => {
  const response = await api.put(`/announcements/${id}`, announcement);
  return response.data;
};

export const deleteAnnouncement = async (id: string) => {
  const response = await api.delete(`/announcements/${id}`);
  return response.data;
};