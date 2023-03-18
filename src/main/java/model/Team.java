package model;

import java.sql.Blob;

public class Team {
        private Long id;
        private String name;
        private Blob logo;
        private int totalMember;
        private String slogan;
        private int elo;

        public Team() {
        }

        public Team(Long id, String name, Blob logo, int totalMember, String slogan, int elo) {
                this.id = id;
                this.name = name;
                this.logo = logo;
                this.totalMember = totalMember;
                this.slogan = slogan;
                this.elo = elo;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Blob getLogo() {
                return logo;
        }

        public void setLogo(Blob logo) {
                this.logo = logo;
        }

        public int getTotalMember() {
                return totalMember;
        }

        public void setTotalMember(int totalMember) {
                this.totalMember = totalMember;
        }

        public String getSlogan() {
                return slogan;
        }

        public void setSlogan(String slogan) {
                this.slogan = slogan;
        }

        public int getElo() {
                return elo;
        }

        public void setElo(int elo) {
                this.elo = elo;
        }

        @Override
        public String toString() {
                return "Team{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", logo=" + logo +
                        ", totalMember=" + totalMember +
                        ", slogan='" + slogan + '\'' +
                        ", elo=" + elo +
                        '}';
        }
}
