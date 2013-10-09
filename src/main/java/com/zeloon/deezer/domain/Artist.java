/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zeloon.deezer.domain;

public class Artist {

    private Long id;
    private String name;
    private String link;
    private String picture;
    private Integer nb_album;
    private Long nb_fan;
    private Boolean radio;
    private String type;

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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getNb_album() {
        return nb_album;
    }

    public void setNb_album(Integer nb_album) {
        this.nb_album = nb_album;
    }

    public Long getNb_fan() {
        return nb_fan;
    }

    public void setNb_fan(Long nb_fan) {
        this.nb_fan = nb_fan;
    }

    public Boolean getRadio() {
        return radio;
    }

    public void setRadio(Boolean radio) {
        this.radio = radio;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}