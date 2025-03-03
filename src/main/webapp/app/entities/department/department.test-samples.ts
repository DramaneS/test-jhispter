import { IDepartment, NewDepartment } from './department.model';

export const sampleWithRequiredData: IDepartment = {
  id: 32001,
  departmentName: 'pschitt',
};

export const sampleWithPartialData: IDepartment = {
  id: 18435,
  departmentName: 'saluer prout à peine',
};

export const sampleWithFullData: IDepartment = {
  id: 13276,
  departmentName: 'déboucher',
};

export const sampleWithNewData: NewDepartment = {
  departmentName: 'minuscule du fait que',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
