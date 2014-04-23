package org.pentaho.marketplace.domain.model.dtos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PluginVersionDTO {

  //region Attributes
  public String branch;
  public String name;
  public String version;
  public String downloadUrl;
  public String samplesDownloadUrl;
  public String description;
  public String changelog;
  public String buildId;
  public String releaseDate;
  public String minParentVersion;
  public String maxParentVersion;
  //endregion
}
