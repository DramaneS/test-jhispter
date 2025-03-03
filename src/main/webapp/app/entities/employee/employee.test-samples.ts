import dayjs from 'dayjs/esm';

import { IEmployee, NewEmployee } from './employee.model';

export const sampleWithRequiredData: IEmployee = {
  id: 8899,
};

export const sampleWithPartialData: IEmployee = {
  id: 29906,
  firstName: 'Falba',
  lastName: 'Paris',
  email: 'Alix_Roger@gmail.com',
  phoneNumber: 'parce que infime crac',
  salary: 9334,
};

export const sampleWithFullData: IEmployee = {
  id: 19019,
  firstName: 'Ozanne',
  lastName: 'Lemoine',
  email: 'Jehanne_Aubry47@hotmail.fr',
  phoneNumber: 'bang jeune enfant',
  hireDate: dayjs('2025-03-03T03:14'),
  salary: 7424,
  commissionPct: 24282,
};

export const sampleWithNewData: NewEmployee = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
