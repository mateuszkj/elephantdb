/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package elephantdb.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvalidConfigurationException extends Exception implements org.apache.thrift.TBase<InvalidConfigurationException, InvalidConfigurationException._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("InvalidConfigurationException");

  private static final org.apache.thrift.protocol.TField MISMATCHED_DOMAINS_FIELD_DESC = new org.apache.thrift.protocol.TField("mismatched_domains", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField PORT_CHANGED_FIELD_DESC = new org.apache.thrift.protocol.TField("port_changed", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField HOSTS_CHANGED_FIELD_DESC = new org.apache.thrift.protocol.TField("hosts_changed", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new InvalidConfigurationExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new InvalidConfigurationExceptionTupleSchemeFactory());
  }

  private List<String> mismatched_domains; // required
  private boolean port_changed; // required
  private boolean hosts_changed; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MISMATCHED_DOMAINS((short)1, "mismatched_domains"),
    PORT_CHANGED((short)2, "port_changed"),
    HOSTS_CHANGED((short)3, "hosts_changed");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MISMATCHED_DOMAINS
          return MISMATCHED_DOMAINS;
        case 2: // PORT_CHANGED
          return PORT_CHANGED;
        case 3: // HOSTS_CHANGED
          return HOSTS_CHANGED;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PORT_CHANGED_ISSET_ID = 0;
  private static final int __HOSTS_CHANGED_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MISMATCHED_DOMAINS, new org.apache.thrift.meta_data.FieldMetaData("mismatched_domains", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.PORT_CHANGED, new org.apache.thrift.meta_data.FieldMetaData("port_changed", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.HOSTS_CHANGED, new org.apache.thrift.meta_data.FieldMetaData("hosts_changed", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(InvalidConfigurationException.class, metaDataMap);
  }

  public InvalidConfigurationException() {
  }

  public InvalidConfigurationException(
    List<String> mismatched_domains,
    boolean port_changed,
    boolean hosts_changed)
  {
    this();
    this.mismatched_domains = mismatched_domains;
    this.port_changed = port_changed;
    set_port_changed_isSet(true);
    this.hosts_changed = hosts_changed;
    set_hosts_changed_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InvalidConfigurationException(InvalidConfigurationException other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.is_set_mismatched_domains()) {
      List<String> __this__mismatched_domains = new ArrayList<String>();
      for (String other_element : other.mismatched_domains) {
        __this__mismatched_domains.add(other_element);
      }
      this.mismatched_domains = __this__mismatched_domains;
    }
    this.port_changed = other.port_changed;
    this.hosts_changed = other.hosts_changed;
  }

  public InvalidConfigurationException deepCopy() {
    return new InvalidConfigurationException(this);
  }

  @Override
  public void clear() {
    this.mismatched_domains = null;
    set_port_changed_isSet(false);
    this.port_changed = false;
    set_hosts_changed_isSet(false);
    this.hosts_changed = false;
  }

  public int get_mismatched_domains_size() {
    return (this.mismatched_domains == null) ? 0 : this.mismatched_domains.size();
  }

  public java.util.Iterator<String> get_mismatched_domains_iterator() {
    return (this.mismatched_domains == null) ? null : this.mismatched_domains.iterator();
  }

  public void add_to_mismatched_domains(String elem) {
    if (this.mismatched_domains == null) {
      this.mismatched_domains = new ArrayList<String>();
    }
    this.mismatched_domains.add(elem);
  }

  public List<String> get_mismatched_domains() {
    return this.mismatched_domains;
  }

  public void set_mismatched_domains(List<String> mismatched_domains) {
    this.mismatched_domains = mismatched_domains;
  }

  public void unset_mismatched_domains() {
    this.mismatched_domains = null;
  }

  /** Returns true if field mismatched_domains is set (has been assigned a value) and false otherwise */
  public boolean is_set_mismatched_domains() {
    return this.mismatched_domains != null;
  }

  public void set_mismatched_domains_isSet(boolean value) {
    if (!value) {
      this.mismatched_domains = null;
    }
  }

  public boolean is_port_changed() {
    return this.port_changed;
  }

  public void set_port_changed(boolean port_changed) {
    this.port_changed = port_changed;
    set_port_changed_isSet(true);
  }

  public void unset_port_changed() {
    __isset_bit_vector.clear(__PORT_CHANGED_ISSET_ID);
  }

  /** Returns true if field port_changed is set (has been assigned a value) and false otherwise */
  public boolean is_set_port_changed() {
    return __isset_bit_vector.get(__PORT_CHANGED_ISSET_ID);
  }

  public void set_port_changed_isSet(boolean value) {
    __isset_bit_vector.set(__PORT_CHANGED_ISSET_ID, value);
  }

  public boolean is_hosts_changed() {
    return this.hosts_changed;
  }

  public void set_hosts_changed(boolean hosts_changed) {
    this.hosts_changed = hosts_changed;
    set_hosts_changed_isSet(true);
  }

  public void unset_hosts_changed() {
    __isset_bit_vector.clear(__HOSTS_CHANGED_ISSET_ID);
  }

  /** Returns true if field hosts_changed is set (has been assigned a value) and false otherwise */
  public boolean is_set_hosts_changed() {
    return __isset_bit_vector.get(__HOSTS_CHANGED_ISSET_ID);
  }

  public void set_hosts_changed_isSet(boolean value) {
    __isset_bit_vector.set(__HOSTS_CHANGED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MISMATCHED_DOMAINS:
      if (value == null) {
        unset_mismatched_domains();
      } else {
        set_mismatched_domains((List<String>)value);
      }
      break;

    case PORT_CHANGED:
      if (value == null) {
        unset_port_changed();
      } else {
        set_port_changed((Boolean)value);
      }
      break;

    case HOSTS_CHANGED:
      if (value == null) {
        unset_hosts_changed();
      } else {
        set_hosts_changed((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MISMATCHED_DOMAINS:
      return get_mismatched_domains();

    case PORT_CHANGED:
      return Boolean.valueOf(is_port_changed());

    case HOSTS_CHANGED:
      return Boolean.valueOf(is_hosts_changed());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MISMATCHED_DOMAINS:
      return is_set_mismatched_domains();
    case PORT_CHANGED:
      return is_set_port_changed();
    case HOSTS_CHANGED:
      return is_set_hosts_changed();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InvalidConfigurationException)
      return this.equals((InvalidConfigurationException)that);
    return false;
  }

  public boolean equals(InvalidConfigurationException that) {
    if (that == null)
      return false;

    boolean this_present_mismatched_domains = true && this.is_set_mismatched_domains();
    boolean that_present_mismatched_domains = true && that.is_set_mismatched_domains();
    if (this_present_mismatched_domains || that_present_mismatched_domains) {
      if (!(this_present_mismatched_domains && that_present_mismatched_domains))
        return false;
      if (!this.mismatched_domains.equals(that.mismatched_domains))
        return false;
    }

    boolean this_present_port_changed = true;
    boolean that_present_port_changed = true;
    if (this_present_port_changed || that_present_port_changed) {
      if (!(this_present_port_changed && that_present_port_changed))
        return false;
      if (this.port_changed != that.port_changed)
        return false;
    }

    boolean this_present_hosts_changed = true;
    boolean that_present_hosts_changed = true;
    if (this_present_hosts_changed || that_present_hosts_changed) {
      if (!(this_present_hosts_changed && that_present_hosts_changed))
        return false;
      if (this.hosts_changed != that.hosts_changed)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_mismatched_domains = true && (is_set_mismatched_domains());
    builder.append(present_mismatched_domains);
    if (present_mismatched_domains)
      builder.append(mismatched_domains);

    boolean present_port_changed = true;
    builder.append(present_port_changed);
    if (present_port_changed)
      builder.append(port_changed);

    boolean present_hosts_changed = true;
    builder.append(present_hosts_changed);
    if (present_hosts_changed)
      builder.append(hosts_changed);

    return builder.toHashCode();
  }

  public int compareTo(InvalidConfigurationException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    InvalidConfigurationException typedOther = (InvalidConfigurationException)other;

    lastComparison = Boolean.valueOf(is_set_mismatched_domains()).compareTo(typedOther.is_set_mismatched_domains());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_mismatched_domains()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mismatched_domains, typedOther.mismatched_domains);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_port_changed()).compareTo(typedOther.is_set_port_changed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_port_changed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.port_changed, typedOther.port_changed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_hosts_changed()).compareTo(typedOther.is_set_hosts_changed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_hosts_changed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hosts_changed, typedOther.hosts_changed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("InvalidConfigurationException(");
    boolean first = true;

    sb.append("mismatched_domains:");
    if (this.mismatched_domains == null) {
      sb.append("null");
    } else {
      sb.append(this.mismatched_domains);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("port_changed:");
    sb.append(this.port_changed);
    first = false;
    if (!first) sb.append(", ");
    sb.append("hosts_changed:");
    sb.append(this.hosts_changed);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_mismatched_domains()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'mismatched_domains' is unset! Struct:" + toString());
    }

    if (!is_set_port_changed()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'port_changed' is unset! Struct:" + toString());
    }

    if (!is_set_hosts_changed()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'hosts_changed' is unset! Struct:" + toString());
    }

  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class InvalidConfigurationExceptionStandardSchemeFactory implements SchemeFactory {
    public InvalidConfigurationExceptionStandardScheme getScheme() {
      return new InvalidConfigurationExceptionStandardScheme();
    }
  }

  private static class InvalidConfigurationExceptionStandardScheme extends StandardScheme<InvalidConfigurationException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, InvalidConfigurationException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MISMATCHED_DOMAINS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list36 = iprot.readListBegin();
                struct.mismatched_domains = new ArrayList<String>(_list36.size);
                for (int _i37 = 0; _i37 < _list36.size; ++_i37)
                {
                  String _elem38; // required
                  _elem38 = iprot.readString();
                  struct.mismatched_domains.add(_elem38);
                }
                iprot.readListEnd();
              }
              struct.set_mismatched_domains_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PORT_CHANGED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.port_changed = iprot.readBool();
              struct.set_port_changed_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HOSTS_CHANGED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.hosts_changed = iprot.readBool();
              struct.set_hosts_changed_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, InvalidConfigurationException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mismatched_domains != null) {
        oprot.writeFieldBegin(MISMATCHED_DOMAINS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.mismatched_domains.size()));
          for (String _iter39 : struct.mismatched_domains)
          {
            oprot.writeString(_iter39);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PORT_CHANGED_FIELD_DESC);
      oprot.writeBool(struct.port_changed);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HOSTS_CHANGED_FIELD_DESC);
      oprot.writeBool(struct.hosts_changed);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InvalidConfigurationExceptionTupleSchemeFactory implements SchemeFactory {
    public InvalidConfigurationExceptionTupleScheme getScheme() {
      return new InvalidConfigurationExceptionTupleScheme();
    }
  }

  private static class InvalidConfigurationExceptionTupleScheme extends TupleScheme<InvalidConfigurationException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, InvalidConfigurationException struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.mismatched_domains.size());
        for (String _iter40 : struct.mismatched_domains)
        {
          oprot.writeString(_iter40);
        }
      }
      oprot.writeBool(struct.port_changed);
      oprot.writeBool(struct.hosts_changed);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, InvalidConfigurationException struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list41 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.mismatched_domains = new ArrayList<String>(_list41.size);
        for (int _i42 = 0; _i42 < _list41.size; ++_i42)
        {
          String _elem43; // required
          _elem43 = iprot.readString();
          struct.mismatched_domains.add(_elem43);
        }
      }
      struct.set_mismatched_domains_isSet(true);
      struct.port_changed = iprot.readBool();
      struct.set_port_changed_isSet(true);
      struct.hosts_changed = iprot.readBool();
      struct.set_hosts_changed_isSet(true);
    }
  }

}

