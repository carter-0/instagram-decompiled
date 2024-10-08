package X;

import com.fasterxml.jackson.databind.ext.Java7HandlersImpl;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/* renamed from: X.T9k  reason: case insensitive filesystem */
public final class C12838T9k implements Serializable {
    public static final Java7HandlersImpl A02;
    public static final C12838T9k A03 = new C12838T9k();
    public static final Class A04;
    public static final Class A05 = Node.class;
    public final Map A00;
    public final Map A01;

    static {
        Java7HandlersImpl java7HandlersImpl = null;
        Class<Document> cls = Document.class;
        A04 = cls;
        try {
            java7HandlersImpl = Java7HandlersImpl.A00;
        } catch (Throwable unused) {
        }
        A02 = java7HandlersImpl;
    }

    public static Object A00(C268894eF r15, String str) {
        Class<?> cls;
        String str2 = str;
        try {
            cls = Class.forName(str2);
            return C269574fL.A03(cls, false);
        } catch (Throwable th) {
            throw AnonymousClass7TE.A0z(002.A16("Failed to find class `", str2, "` for handling values of type ", C269574fL.A04(r15), ", problem: (", C66581MXm.A0y(th), ") ", th.getMessage()));
        }
    }

    public C12838T9k() {
        HashMap A1E = AnonymousClass7TE.A1E();
        this.A00 = A1E;
        A1E.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        A1E.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap A1E2 = AnonymousClass7TE.A1E();
        this.A01 = A1E2;
        A1E2.put("java.sql.Timestamp", DateSerializer.A00);
        A1E2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        A1E2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        A1E2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        A1E2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }
}
