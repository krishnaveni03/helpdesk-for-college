import api from './api';
import { CampusLocation } from '../types';

export const getLocations = async () => {
  const response = await api.get('/locations');
  return response.data;
};

export const createLocation = async (location: CampusLocation) => {
  const response = await api.post('/locations', location);
  return response.data;
};

export const updateLocation = async (id: string, location: CampusLocation) => {
  const response = await api.put(`/locations/${id}`, location);
  return response.data;
};

export const deleteLocation = async (id: string) => {
  const response = await api.delete(`/locations/${id}`);
  return response.data;
};