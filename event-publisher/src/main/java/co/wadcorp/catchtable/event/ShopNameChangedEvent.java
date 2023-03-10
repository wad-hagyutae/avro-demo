/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package co.wadcorp.catchtable.event;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;
import java.util.Optional;
@org.apache.avro.specific.AvroGenerated
public class ShopNameChangedEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7207234483440051779L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShopNameChangedEvent\",\"namespace\":\"co.wadcorp.catchtable.event\",\"fields\":[{\"name\":\"shop_id\",\"type\":\"int\"},{\"name\":\"shop_name2\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ShopNameChangedEvent> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ShopNameChangedEvent> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ShopNameChangedEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ShopNameChangedEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ShopNameChangedEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ShopNameChangedEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ShopNameChangedEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ShopNameChangedEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ShopNameChangedEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private int shop_id;
  private java.lang.String shop_name2;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ShopNameChangedEvent() {}

  /**
   * All-args constructor.
   * @param shop_id The new value for shop_id
   * @param shop_name2 The new value for shop_name2
   */
  public ShopNameChangedEvent(java.lang.Integer shop_id, java.lang.String shop_name2) {
    this.shop_id = shop_id;
    this.shop_name2 = shop_name2;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return shop_id;
    case 1: return shop_name2;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: shop_id = (java.lang.Integer)value$; break;
    case 1: shop_name2 = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'shop_id' field.
   * @return The value of the 'shop_id' field.
   */
  public int getShopId() {
    return shop_id;
  }

  /**
   * Gets the value of the 'shop_id' field as an Optional&lt;java.lang.Integer&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.Integer&gt;.
   */
  public Optional<java.lang.Integer> getOptionalShopId() {
    return Optional.<java.lang.Integer>ofNullable(shop_id);
  }


  /**
   * Gets the value of the 'shop_name2' field.
   * @return The value of the 'shop_name2' field.
   */
  public java.lang.String getShopName2() {
    return shop_name2;
  }

  /**
   * Gets the value of the 'shop_name2' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalShopName2() {
    return Optional.<java.lang.String>ofNullable(shop_name2);
  }


  /**
   * Creates a new ShopNameChangedEvent RecordBuilder.
   * @return A new ShopNameChangedEvent RecordBuilder
   */
  public static co.wadcorp.catchtable.event.ShopNameChangedEvent.Builder newBuilder() {
    return new co.wadcorp.catchtable.event.ShopNameChangedEvent.Builder();
  }

  /**
   * Creates a new ShopNameChangedEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ShopNameChangedEvent RecordBuilder
   */
  public static co.wadcorp.catchtable.event.ShopNameChangedEvent.Builder newBuilder(co.wadcorp.catchtable.event.ShopNameChangedEvent.Builder other) {
    if (other == null) {
      return new co.wadcorp.catchtable.event.ShopNameChangedEvent.Builder();
    } else {
      return new co.wadcorp.catchtable.event.ShopNameChangedEvent.Builder(other);
    }
  }

  /**
   * Creates a new ShopNameChangedEvent RecordBuilder by copying an existing ShopNameChangedEvent instance.
   * @param other The existing instance to copy.
   * @return A new ShopNameChangedEvent RecordBuilder
   */
  public static co.wadcorp.catchtable.event.ShopNameChangedEvent.Builder newBuilder(co.wadcorp.catchtable.event.ShopNameChangedEvent other) {
    if (other == null) {
      return new co.wadcorp.catchtable.event.ShopNameChangedEvent.Builder();
    } else {
      return new co.wadcorp.catchtable.event.ShopNameChangedEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for ShopNameChangedEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ShopNameChangedEvent>
    implements org.apache.avro.data.RecordBuilder<ShopNameChangedEvent> {

    private int shop_id;
    private java.lang.String shop_name2;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(co.wadcorp.catchtable.event.ShopNameChangedEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.shop_id)) {
        this.shop_id = data().deepCopy(fields()[0].schema(), other.shop_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.shop_name2)) {
        this.shop_name2 = data().deepCopy(fields()[1].schema(), other.shop_name2);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing ShopNameChangedEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(co.wadcorp.catchtable.event.ShopNameChangedEvent other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.shop_id)) {
        this.shop_id = data().deepCopy(fields()[0].schema(), other.shop_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.shop_name2)) {
        this.shop_name2 = data().deepCopy(fields()[1].schema(), other.shop_name2);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'shop_id' field.
      * @return The value.
      */
    public int getShopId() {
      return shop_id;
    }

    /**
      * Gets the value of the 'shop_id' field as an Optional&lt;java.lang.Integer&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.Integer&gt;.
      */
    public Optional<java.lang.Integer> getOptionalShopId() {
      return Optional.<java.lang.Integer>ofNullable(shop_id);
    }

    /**
      * Sets the value of the 'shop_id' field.
      * @param value The value of 'shop_id'.
      * @return This builder.
      */
    public co.wadcorp.catchtable.event.ShopNameChangedEvent.Builder setShopId(int value) {
      validate(fields()[0], value);
      this.shop_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'shop_id' field has been set.
      * @return True if the 'shop_id' field has been set, false otherwise.
      */
    public boolean hasShopId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'shop_id' field.
      * @return This builder.
      */
    public co.wadcorp.catchtable.event.ShopNameChangedEvent.Builder clearShopId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'shop_name2' field.
      * @return The value.
      */
    public java.lang.String getShopName2() {
      return shop_name2;
    }

    /**
      * Gets the value of the 'shop_name2' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalShopName2() {
      return Optional.<java.lang.String>ofNullable(shop_name2);
    }

    /**
      * Sets the value of the 'shop_name2' field.
      * @param value The value of 'shop_name2'.
      * @return This builder.
      */
    public co.wadcorp.catchtable.event.ShopNameChangedEvent.Builder setShopName2(java.lang.String value) {
      validate(fields()[1], value);
      this.shop_name2 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'shop_name2' field has been set.
      * @return True if the 'shop_name2' field has been set, false otherwise.
      */
    public boolean hasShopName2() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'shop_name2' field.
      * @return This builder.
      */
    public co.wadcorp.catchtable.event.ShopNameChangedEvent.Builder clearShopName2() {
      shop_name2 = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ShopNameChangedEvent build() {
      try {
        ShopNameChangedEvent record = new ShopNameChangedEvent();
        record.shop_id = fieldSetFlags()[0] ? this.shop_id : (java.lang.Integer) defaultValue(fields()[0]);
        record.shop_name2 = fieldSetFlags()[1] ? this.shop_name2 : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ShopNameChangedEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<ShopNameChangedEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ShopNameChangedEvent>
    READER$ = (org.apache.avro.io.DatumReader<ShopNameChangedEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.shop_id);

    out.writeString(this.shop_name2);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.shop_id = in.readInt();

      this.shop_name2 = in.readString();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.shop_id = in.readInt();
          break;

        case 1:
          this.shop_name2 = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










