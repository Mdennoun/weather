package com.weather.model;

public class Weather {



        Temperature TemperatureObject;
        Pression PressionObject;
        private float pluie;
        private float pluie_convective;
        Humidite HumiditeObject;
        VentMoyen Vent_moyenObject;
        VentRafales Vent_rafalesObject;
        VentDirection Vent_directionObject;
        private float iso_zero;
        private String risque_neige;
        private float cape;
        Nebulosite NebulositeObject;


        // Getter Methods

        public Temperature getTemperature() {
            return TemperatureObject;
        }

        public Pression getPression() {
            return PressionObject;
        }

        public float getPluie() {
            return pluie;
        }

        public float getPluie_convective() {
            return pluie_convective;
        }

        public Humidite getHumidite() {
            return HumiditeObject;
        }

        public VentMoyen getVent_moyen() {
            return Vent_moyenObject;
        }

        public VentRafales getVent_rafales() {
            return Vent_rafalesObject;
        }

        public VentDirection getVent_direction() {
            return Vent_directionObject;
        }

        public float getIso_zero() {
            return iso_zero;
        }

        public String getRisque_neige() {
            return risque_neige;
        }

        public float getCape() {
            return cape;
        }

        public Nebulosite getNebulosite() {
            return NebulositeObject;
        }

        // Setter Methods

        public void setTemperature(Temperature temperatureObject) {
            this.TemperatureObject = temperatureObject;
        }

        public void setPression(Pression pressionObject) {
            this.PressionObject = pressionObject;
        }

        public void setPluie(float pluie) {
            this.pluie = pluie;
        }

        public void setPluie_convective(float pluie_convective) {
            this.pluie_convective = pluie_convective;
        }

        public void setHumidite(Humidite humiditeObject) {
            this.HumiditeObject = humiditeObject;
        }

        public void setVent_moyen(VentMoyen vent_moyenObject) {
            this.Vent_moyenObject = vent_moyenObject;
        }

        public void setVent_rafales(VentRafales vent_rafalesObject) {
            this.Vent_rafalesObject = vent_rafalesObject;
        }

        public void setVent_direction(VentDirection vent_directionObject) {
            this.Vent_directionObject = vent_directionObject;
        }

        public void setIso_zero(float iso_zero) {
            this.iso_zero = iso_zero;
        }

        public void setRisque_neige(String risque_neige) {
            this.risque_neige = risque_neige;
        }

        public void setCape(float cape) {
            this.cape = cape;
        }

        public void setNebulosite(Nebulosite nebulositeObject) {
            this.NebulositeObject = nebulositeObject;
        }

    @Override
    public String toString() {
        return "Weather{" +
                "TemperatureObject=" + TemperatureObject +
                ", PressionObject=" + PressionObject +
                ", pluie=" + pluie +
                ", pluie_convective=" + pluie_convective +
                ", HumiditeObject=" + HumiditeObject +
                ", Vent_moyenObject=" + Vent_moyenObject +
                ", Vent_rafalesObject=" + Vent_rafalesObject +
                ", Vent_directionObject=" + Vent_directionObject +
                ", iso_zero=" + iso_zero +
                ", risque_neige='" + risque_neige + '\'' +
                ", cape=" + cape +
                ", NebulositeObject=" + NebulositeObject +
                '}';
    }
}
