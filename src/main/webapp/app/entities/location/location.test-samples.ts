import { ILocation, NewLocation } from './location.model';

export const sampleWithRequiredData: ILocation = {
  id: 12482,
};

export const sampleWithPartialData: ILocation = {
  id: 30179,
  postalCode: 'foule',
  city: 'Mulhouse',
};

export const sampleWithFullData: ILocation = {
  id: 22007,
  streetAddress: "abattre à l'insu de",
  postalCode: 'hors de durer à la merci',
  city: 'Créteil',
  stateProvince: 'certainement paf depuis',
};

export const sampleWithNewData: NewLocation = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
