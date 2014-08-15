/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.common.flume.shared.avro.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LogData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LogData\",\"namespace\":\"org.kaaproject.kaa.server.common.flume.shared.avro.gen\",\"fields\":[{\"name\":\"schemaVersion\",\"type\":\"int\"},{\"name\":\"applicationToken\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"logEvents\",\"type\":{\"type\":\"array\",\"items\":\"bytes\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private int schemaVersion;
   private java.lang.String applicationToken;
   private java.util.List<java.nio.ByteBuffer> logEvents;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public LogData() {}

  /**
   * All-args constructor.
   */
  public LogData(java.lang.Integer schemaVersion, java.lang.String applicationToken, java.util.List<java.nio.ByteBuffer> logEvents) {
    this.schemaVersion = schemaVersion;
    this.applicationToken = applicationToken;
    this.logEvents = logEvents;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return schemaVersion;
    case 1: return applicationToken;
    case 2: return logEvents;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: schemaVersion = (java.lang.Integer)value$; break;
    case 1: applicationToken = (java.lang.String)value$; break;
    case 2: logEvents = (java.util.List<java.nio.ByteBuffer>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'schemaVersion' field.
   */
  public java.lang.Integer getSchemaVersion() {
    return schemaVersion;
  }

  /**
   * Sets the value of the 'schemaVersion' field.
   * @param value the value to set.
   */
  public void setSchemaVersion(java.lang.Integer value) {
    this.schemaVersion = value;
  }

  /**
   * Gets the value of the 'applicationToken' field.
   */
  public java.lang.String getApplicationToken() {
    return applicationToken;
  }

  /**
   * Sets the value of the 'applicationToken' field.
   * @param value the value to set.
   */
  public void setApplicationToken(java.lang.String value) {
    this.applicationToken = value;
  }

  /**
   * Gets the value of the 'logEvents' field.
   */
  public java.util.List<java.nio.ByteBuffer> getLogEvents() {
    return logEvents;
  }

  /**
   * Sets the value of the 'logEvents' field.
   * @param value the value to set.
   */
  public void setLogEvents(java.util.List<java.nio.ByteBuffer> value) {
    this.logEvents = value;
  }

  /** Creates a new LogData RecordBuilder */
  public static org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData.Builder newBuilder() {
    return new org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData.Builder();
  }
  
  /** Creates a new LogData RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData.Builder newBuilder(org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData.Builder other) {
    return new org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData.Builder(other);
  }
  
  /** Creates a new LogData RecordBuilder by copying an existing LogData instance */
  public static org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData.Builder newBuilder(org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData other) {
    return new org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData.Builder(other);
  }
  
  /**
   * RecordBuilder for LogData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LogData>
    implements org.apache.avro.data.RecordBuilder<LogData> {

    private int schemaVersion;
    private java.lang.String applicationToken;
    private java.util.List<java.nio.ByteBuffer> logEvents;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.schemaVersion)) {
        this.schemaVersion = data().deepCopy(fields()[0].schema(), other.schemaVersion);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.applicationToken)) {
        this.applicationToken = data().deepCopy(fields()[1].schema(), other.applicationToken);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.logEvents)) {
        this.logEvents = data().deepCopy(fields()[2].schema(), other.logEvents);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing LogData instance */
    private Builder(org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData other) {
            super(org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData.SCHEMA$);
      if (isValidValue(fields()[0], other.schemaVersion)) {
        this.schemaVersion = data().deepCopy(fields()[0].schema(), other.schemaVersion);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.applicationToken)) {
        this.applicationToken = data().deepCopy(fields()[1].schema(), other.applicationToken);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.logEvents)) {
        this.logEvents = data().deepCopy(fields()[2].schema(), other.logEvents);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'schemaVersion' field */
    public java.lang.Integer getSchemaVersion() {
      return schemaVersion;
    }
    
    /** Sets the value of the 'schemaVersion' field */
    public org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData.Builder setSchemaVersion(int value) {
      validate(fields()[0], value);
      this.schemaVersion = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'schemaVersion' field has been set */
    public boolean hasSchemaVersion() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'schemaVersion' field */
    public org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData.Builder clearSchemaVersion() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'applicationToken' field */
    public java.lang.String getApplicationToken() {
      return applicationToken;
    }
    
    /** Sets the value of the 'applicationToken' field */
    public org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData.Builder setApplicationToken(java.lang.String value) {
      validate(fields()[1], value);
      this.applicationToken = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'applicationToken' field has been set */
    public boolean hasApplicationToken() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'applicationToken' field */
    public org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData.Builder clearApplicationToken() {
      applicationToken = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'logEvents' field */
    public java.util.List<java.nio.ByteBuffer> getLogEvents() {
      return logEvents;
    }
    
    /** Sets the value of the 'logEvents' field */
    public org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData.Builder setLogEvents(java.util.List<java.nio.ByteBuffer> value) {
      validate(fields()[2], value);
      this.logEvents = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'logEvents' field has been set */
    public boolean hasLogEvents() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'logEvents' field */
    public org.kaaproject.kaa.server.common.flume.shared.avro.gen.LogData.Builder clearLogEvents() {
      logEvents = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public LogData build() {
      try {
        LogData record = new LogData();
        record.schemaVersion = fieldSetFlags()[0] ? this.schemaVersion : (java.lang.Integer) defaultValue(fields()[0]);
        record.applicationToken = fieldSetFlags()[1] ? this.applicationToken : (java.lang.String) defaultValue(fields()[1]);
        record.logEvents = fieldSetFlags()[2] ? this.logEvents : (java.util.List<java.nio.ByteBuffer>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}