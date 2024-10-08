package com.fasterxml.jackson.databind;

import X.15p;
import X.16F;
import X.17W;
import X.17Z;
import X.AnonymousClass00P;
import X.AnonymousClass4iD;
import X.C250673ls;
import X.C252513pE;
import X.C252523pF;
import X.C267574bm;
import X.C268964eM;
import X.C269424f6;
import X.C269494fD;
import X.C269504fE;
import X.C291415hE;
import X.SGT;
import X.SN1;
import X.SPK;
import android.util.Base64;
import com.facebook.common.json.FbSerializerProvider$1;
import com.facebook.common.json.FbSerializerProvider$3;
import com.facebook.common.json.FbSerializerProvider$4;
import com.facebook.common.json.FbSerializerProvider$5;
import com.facebook.common.json.FbSerializerProvider$6;
import com.facebook.graphservice.interfaces.Tree;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.ClassSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase;
import com.fasterxml.jackson.databind.ser.std.FileSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicBooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicIntegerSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicLongSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class JsonSerializer {
    public boolean A06() {
        return false;
    }

    public JsonSerializer A07(SGT sgt) {
        return this;
    }

    public boolean A08() {
        return false;
    }

    public abstract class None extends JsonSerializer {
        public None() {
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public Class A05() {
        if (this instanceof StdSerializer) {
            return ((StdSerializer) this).A00;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v111, types: [java.lang.Throwable, X.1bF, X.Qhe, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r0v117, types: [java.lang.Throwable, X.1bF, X.Qhe, java.io.IOException] */
    public void A0A(17Z r11, C269504fE r12, Object obj) {
        Number number;
        int intValue;
        long j;
        String encodeToString;
        boolean z;
        boolean A0T;
        String A1O;
        if (!(this instanceof SerializableSerializer)) {
            if (this instanceof FbSerializerProvider$6) {
                Map map = (Map) obj;
                r11.A0c();
                for (Object next : map.keySet()) {
                    if (next instanceof String) {
                        A1O = (String) next;
                    } else if (next instanceof Enum) {
                        15p A03 = r11.A0D().A03();
                        StringWriter stringWriter = new StringWriter();
                        17W A0A = A03.A0A(stringWriter);
                        A0A.A01 = r11.A0D();
                        A0A.A0J(next);
                        A0A.flush();
                        16F A032 = A03.A03(stringWriter.toString());
                        A1O = A032.A1O();
                        if (A1O == null || A032.A1J() != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Tried to use json as map key, but it is not a string: ");
                            sb.append(stringWriter);
                            ? iOException = new IOException(sb.toString(), (Throwable) null);
                            iOException.A00 = null;
                            iOException.A00 = null;
                            throw iOException;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Non-string, non-enum key (");
                        sb2.append(next.getClass());
                        sb2.append(") found in map.");
                        ? iOException2 = new IOException(sb2.toString(), (Throwable) null);
                        iOException2.A00 = null;
                        iOException2.A00 = null;
                        throw iOException2;
                    }
                    r11.A0q(A1O);
                    r11.A0J(map.get(next));
                }
            } else {
                if (this instanceof BooleanSerializer) {
                    z = Boolean.TRUE.equals(obj);
                } else {
                    if (this instanceof StringSerializer) {
                        encodeToString = (String) obj;
                    } else if (this instanceof FbSerializerProvider$1) {
                        C291415hE.A01(r11, r12, (Collection) obj);
                        return;
                    } else {
                        if (this instanceof NumberSerializers$FloatSerializer) {
                            number = (Number) obj;
                        } else if (this instanceof TokenBufferSerializer) {
                            ((C267574bm) obj).A12(r11);
                            return;
                        } else if (this instanceof ToStringSerializerBase) {
                            encodeToString = ((ToStringSerializerBase) this).A0E(obj);
                        } else if (this instanceof NullSerializer) {
                            r11.A0a();
                            return;
                        } else if (this instanceof ToEmptyObjectSerializer) {
                            ToEmptyObjectSerializer toEmptyObjectSerializer = (ToEmptyObjectSerializer) this;
                            if (toEmptyObjectSerializer instanceof UnknownSerializer) {
                                if (r12.A05.A0D(C269424f6.FAIL_ON_EMPTY_BEANS)) {
                                    r12.A09(String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", new Object[]{obj.getClass().getName()}), toEmptyObjectSerializer.A00);
                                    throw AnonymousClass00P.createAndThrow();
                                }
                            }
                            r11.A0K(obj, 0);
                        } else if (this instanceof FailingSerializer) {
                            throw new AnonymousClass4iD(((C269494fD) r12).A00, ((FailingSerializer) this).A00, (Throwable) null);
                        } else if (this instanceof UUIDSerializer) {
                            UUID uuid = (UUID) obj;
                            Boolean bool = ((UUIDSerializer) this).A00;
                            if (bool != null) {
                                A0T = bool.booleanValue();
                            } else {
                                if (!(r11 instanceof C267574bm)) {
                                    A0T = r11.A0T();
                                }
                                char[] cArr = new char[36];
                                long mostSignificantBits = uuid.getMostSignificantBits();
                                int i = (int) (mostSignificantBits >> 32);
                                UUIDSerializer.A04(cArr, i >> 16, 0);
                                UUIDSerializer.A04(cArr, i, 4);
                                cArr[8] = '-';
                                int i2 = (int) mostSignificantBits;
                                UUIDSerializer.A04(cArr, i2 >>> 16, 9);
                                cArr[13] = '-';
                                UUIDSerializer.A04(cArr, i2, 14);
                                cArr[18] = '-';
                                long leastSignificantBits = uuid.getLeastSignificantBits();
                                UUIDSerializer.A04(cArr, (int) (leastSignificantBits >>> 48), 19);
                                cArr[23] = '-';
                                UUIDSerializer.A04(cArr, (int) (leastSignificantBits >>> 32), 24);
                                int i3 = (int) leastSignificantBits;
                                UUIDSerializer.A04(cArr, i3 >> 16, 28);
                                UUIDSerializer.A04(cArr, i3, 32);
                                r11.A0z(cArr, 0, 36);
                                return;
                            }
                            if (A0T) {
                                byte[] bArr = new byte[16];
                                long mostSignificantBits2 = uuid.getMostSignificantBits();
                                long leastSignificantBits2 = uuid.getLeastSignificantBits();
                                UUIDSerializer.A03((int) (mostSignificantBits2 >> 32), bArr, 0);
                                UUIDSerializer.A03((int) mostSignificantBits2, bArr, 4);
                                UUIDSerializer.A03((int) (leastSignificantBits2 >> 32), bArr, 8);
                                UUIDSerializer.A03((int) leastSignificantBits2, bArr, 12);
                                r11.A0i(C268964eM.A01, bArr, 0, 16);
                                return;
                            }
                            char[] cArr2 = new char[36];
                            long mostSignificantBits3 = uuid.getMostSignificantBits();
                            int i4 = (int) (mostSignificantBits3 >> 32);
                            UUIDSerializer.A04(cArr2, i4 >> 16, 0);
                            UUIDSerializer.A04(cArr2, i4, 4);
                            cArr2[8] = '-';
                            int i22 = (int) mostSignificantBits3;
                            UUIDSerializer.A04(cArr2, i22 >>> 16, 9);
                            cArr2[13] = '-';
                            UUIDSerializer.A04(cArr2, i22, 14);
                            cArr2[18] = '-';
                            long leastSignificantBits3 = uuid.getLeastSignificantBits();
                            UUIDSerializer.A04(cArr2, (int) (leastSignificantBits3 >>> 48), 19);
                            cArr2[23] = '-';
                            UUIDSerializer.A04(cArr2, (int) (leastSignificantBits3 >>> 32), 24);
                            int i32 = (int) leastSignificantBits3;
                            UUIDSerializer.A04(cArr2, i32 >> 16, 28);
                            UUIDSerializer.A04(cArr2, i32, 32);
                            r11.A0z(cArr2, 0, 36);
                            return;
                        } else {
                            if (this instanceof StdJdkSerializers$AtomicLongSerializer) {
                                j = ((AtomicLong) obj).get();
                            } else {
                                if (this instanceof StdJdkSerializers$AtomicIntegerSerializer) {
                                    intValue = ((AtomicInteger) obj).get();
                                } else if (this instanceof StdJdkSerializers$AtomicBooleanSerializer) {
                                    z = ((AtomicBoolean) obj).get();
                                } else if (this instanceof NumberSerializers$ShortSerializer) {
                                    r11.A0w(((Number) obj).shortValue());
                                    return;
                                } else if (this instanceof NumberSerializers$LongSerializer) {
                                    j = ((Number) obj).longValue();
                                } else {
                                    if ((this instanceof NumberSerializers$IntegerSerializer) || (this instanceof NumberSerializers$IntLikeSerializer)) {
                                        number = (Number) obj;
                                    } else {
                                        if (this instanceof NumberSerializers$DoubleSerializer) {
                                            number = (Number) obj;
                                        } else if (this instanceof NumberSerializer) {
                                            number = (Number) obj;
                                            if (number instanceof BigDecimal) {
                                                r11.A0u((BigDecimal) number);
                                                return;
                                            } else if (number instanceof BigInteger) {
                                                r11.A0v((BigInteger) number);
                                                return;
                                            } else if (number instanceof Long) {
                                                j = number.longValue();
                                            } else if (!(number instanceof Double)) {
                                                if (!(number instanceof Float)) {
                                                    if (!(number instanceof Integer) && !(number instanceof Byte) && !(number instanceof Short)) {
                                                        r11.A0r(number.toString());
                                                        return;
                                                    }
                                                }
                                            }
                                        } else if (this instanceof FileSerializer) {
                                            encodeToString = ((File) obj).getAbsolutePath();
                                        } else if (this instanceof ClassSerializer) {
                                            encodeToString = ((Class) obj).getName();
                                        } else {
                                            if (this instanceof DateSerializer) {
                                                DateTimeSerializerBase dateTimeSerializerBase = (DateTimeSerializerBase) this;
                                                Date date = (Date) obj;
                                                if (!dateTimeSerializerBase.A0G(r12)) {
                                                    dateTimeSerializerBase.A0F(r11, r12, date);
                                                    return;
                                                } else if (date != null) {
                                                    j = date.getTime();
                                                }
                                            } else if (this instanceof CalendarSerializer) {
                                                DateTimeSerializerBase dateTimeSerializerBase2 = (DateTimeSerializerBase) this;
                                                Calendar calendar = (Calendar) obj;
                                                if (!dateTimeSerializerBase2.A0G(r12)) {
                                                    dateTimeSerializerBase2.A0F(r11, r12, calendar.getTime());
                                                    return;
                                                } else if (calendar != null) {
                                                    j = calendar.getTimeInMillis();
                                                }
                                            } else if (this instanceof FbSerializerProvider$5) {
                                                encodeToString = ((Enum) obj).name();
                                            } else if (this instanceof FbSerializerProvider$4) {
                                                ByteBuffer serializeTreeToByteBuffer = SN1.A00().serializeTreeToByteBuffer((Tree) ((C250673ls) obj));
                                                byte[] bArr2 = new byte[serializeTreeToByteBuffer.limit()];
                                                serializeTreeToByteBuffer.get(bArr2);
                                                encodeToString = Base64.encodeToString(bArr2, 2);
                                            } else if (this instanceof FbSerializerProvider$3) {
                                                throw new NullPointerException("getTypeTag");
                                            }
                                            j = 0;
                                        }
                                        r11.A0e(number.doubleValue());
                                        return;
                                    }
                                    intValue = number.intValue();
                                }
                                r11.A0g(intValue);
                                return;
                            }
                            r11.A0h(j);
                            return;
                        }
                        r11.A0f(number.floatValue());
                        return;
                    }
                    r11.A0t(encodeToString);
                    return;
                }
                r11.A0x(z);
                return;
            }
            r11.A0Z();
            return;
        }
        ((C252523pF) obj).EN9(r11, r12);
    }

    public boolean A0B(C269504fE r6, Object obj) {
        String str;
        if (this instanceof ToEmptyObjectSerializer) {
            return true;
        }
        if (this instanceof SerializableSerializer) {
            C252523pF r7 = (C252523pF) obj;
            if (r7 instanceof C252513pE) {
                return ((C252513pE) r7).A01(r6);
            }
            return false;
        }
        if (this instanceof ToStringSerializerBase) {
            str = ((ToStringSerializerBase) this).A0E(obj);
        } else if (this instanceof UUIDSerializer) {
            UUID uuid = (UUID) obj;
            if (uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0) {
                return true;
            }
            return false;
        } else if (this instanceof StringSerializer) {
            str = (String) obj;
        } else if ((this instanceof DateTimeSerializerBase) || obj != null) {
            return false;
        } else {
            return true;
        }
        return str.isEmpty();
    }

    public void A09(17Z r4, C269504fE r5, SPK spk, Object obj) {
        Class<?> A05 = A05();
        if (A05 == null) {
            A05 = obj.getClass();
        }
        r5.A09(String.format("Type id handling not implemented for type %s (by serializer of type %s)", new Object[]{A05.getName(), getClass().getName()}), A05);
        throw AnonymousClass00P.createAndThrow();
    }
}
