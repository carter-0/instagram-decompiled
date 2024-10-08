package X;

import android.text.TextUtils;
import android.util.JsonWriter;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Set;

/* renamed from: X.RKl  reason: case insensitive filesystem */
public final class C8993RKl extends Exception {
    public static final Set A01 = Pxf.A0s(new String[]{TraceFieldType.ErrorCode, TraceFieldType.ErrorDomain, DevServerEntity.COLUMN_DESCRIPTION});
    public final Integer A00;

    public final String A00() {
        String message;
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject();
            jsonWriter.name(TraceFieldType.ErrorDomain).value(C9235RUm.A00(this.A00));
            if (!TextUtils.isEmpty((CharSequence) null)) {
                jsonWriter.name(TraceFieldType.ErrorCode).value((String) null);
            }
            if (!TextUtils.isEmpty(getMessage())) {
                JsonWriter name = jsonWriter.name(DevServerEntity.COLUMN_DESCRIPTION);
                if (getMessage().length() > 200) {
                    message = Pxe.A0x(getMessage(), 200);
                } else {
                    message = getMessage();
                }
                name.value(message);
            }
            jsonWriter.endObject();
            return stringWriter.toString();
        } catch (IOException unused) {
            return "";
        }
    }

    public C8993RKl(Integer num, String str, Throwable th) {
        super(str, th);
        this.A00 = num;
    }
}
