package X;

import com.fasterxml.jackson.databind.ser.std.ByteArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$BooleanArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$CharArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$DoubleArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$FloatArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$IntArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$LongArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ShortArraySerializer;
import java.util.HashMap;

/* renamed from: X.SBj  reason: case insensitive filesystem */
public final class C11128SBj {
    public static final HashMap A00;

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        A00 = A1E;
        A1E.put(boolean[].class.getName(), new StdArraySerializers$BooleanArraySerializer());
        A1E.put(byte[].class.getName(), new ByteArraySerializer());
        A1E.put(char[].class.getName(), new StdArraySerializers$CharArraySerializer());
        A1E.put(short[].class.getName(), new StdArraySerializers$ShortArraySerializer());
        A1E.put(int[].class.getName(), new StdArraySerializers$IntArraySerializer());
        A1E.put(long[].class.getName(), new StdArraySerializers$LongArraySerializer());
        A1E.put(float[].class.getName(), new StdArraySerializers$FloatArraySerializer());
        A1E.put(double[].class.getName(), new StdArraySerializers$DoubleArraySerializer());
    }
}
