package X;

import android.util.Base64;
import android.util.JsonWriter;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.encryptedbackup.EncryptedBackupCrypto;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.65B  reason: invalid class name */
public final class AnonymousClass65B {
    public static final AnonymousClass65C A03 = new Object();
    public static final byte[] A04;
    public NB0 A00;
    public boolean A01;
    public final UserSession A02;

    public static final void A03(AnonymousClass65B r7, C62320sa r8, 0sJ r9) {
        NB0 nb0;
        long j;
        synchronized (r7) {
            nb0 = r7.A00;
        }
        if (nb0 == null || nb0.mResultSet.getCount() <= 0) {
            0KC.A0C("IgMailboxEncryptedBackups", "Failed to load MEBReadClientState");
            r8.invoke();
            return;
        }
        byte[] blob = nb0.mResultSet.getBlob(0, 3);
        0qQ.A07(blob);
        byte[] blob2 = nb0.mResultSet.getBlob(0, 4);
        0qQ.A07(blob2);
        String valueOf = String.valueOf(nb0.mResultSet.getLong(0, 1));
        Long nullableLong = nb0.mResultSet.getNullableLong(0, 0);
        if (nullableLong != null) {
            j = nullableLong.longValue();
        } else {
            j = 0;
        }
        r9.invoke(blob, blob2, valueOf, Long.valueOf(j));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.65C, java.lang.Object] */
    static {
        byte[] decode = Base64.decode("kPxziUnMc4MUpeaqUkHj8S1MKoxDyFEukbvxsEB/fwE=", 2);
        0qQ.A07(decode);
        A04 = decode;
    }

    public static final String A00(String str, String str2, byte[] bArr) {
        Charset charset = AnonymousClass15Q.A05;
        byte[] bytes = str2.getBytes(charset);
        0qQ.A07(bytes);
        byte[] bytes2 = str.getBytes(charset);
        0qQ.A07(bytes2);
        byte[] createHmac = EncryptedBackupCrypto.createHmac(bytes, bytes2);
        0qQ.A07(createHmac);
        byte[] ocmfClientMap = EncryptedBackupCrypto.ocmfClientMap(bArr, createHmac);
        0qQ.A07(ocmfClientMap);
        String encodeToString = Base64.encodeToString(ocmfClientMap, 2);
        0qQ.A07(encodeToString);
        return encodeToString;
    }

    public static final String A01(List list) {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            0KC.A0C("IgMailboxEncryptedBackups", "Failed to generate restore request json");
            return "";
        }
    }

    public static final void A04(0sP r4, UserSession userSession) {
        if (!C66612MYy.A00.A02(userSession, true)) {
            C295615oa.A01.A02(new C377089Km(r4, 13), userSession);
        } else if (userSession.A07()) {
            0KC.A0C("IgMailboxEncryptedBackups", "UserSession is stopped, cannot run async callback");
        } else {
            O4T.A00.A02(userSession, AnonymousClass61K.IGD_ENCRYPTED_BACKUP, new C74191PqX(20, (Object) r4, (Object) userSession));
        }
    }

    public AnonymousClass65B(UserSession userSession) {
        this.A02 = userSession;
    }

    public static final void A02(JsonWriter jsonWriter, AnonymousClass65B r4, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            jsonWriter.name((String) entry.getKey());
            if (entry.getValue() instanceof Number) {
                Object value = entry.getValue();
                0qQ.A0C(value, "null cannot be cast to non-null type kotlin.Number");
                jsonWriter.value((Number) value);
            } else if (entry.getValue() instanceof Boolean) {
                Object value2 = entry.getValue();
                0qQ.A0C(value2, "null cannot be cast to non-null type kotlin.Boolean");
                jsonWriter.value(((Boolean) value2).booleanValue());
            } else if (entry.getValue() instanceof Map) {
                jsonWriter.beginObject();
                Object value3 = entry.getValue();
                0qQ.A0C(value3, Pxd.A00(2));
                A02(jsonWriter, r4, (Map) value3);
                jsonWriter.endObject();
            } else {
                jsonWriter.value(entry.getValue().toString());
            }
        }
    }
}
