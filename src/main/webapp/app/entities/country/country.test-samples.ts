import { ICountry, NewCountry } from './country.model';

export const sampleWithRequiredData: ICountry = {
  id: 30729,
};

export const sampleWithPartialData: ICountry = {
  id: 20425,
  countryName: 'pour que émérite en plus de',
};

export const sampleWithFullData: ICountry = {
  id: 28151,
  countryName: 'chut chut responsable',
};

export const sampleWithNewData: NewCountry = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
