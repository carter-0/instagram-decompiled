package X;

import android.content.ContentValues;
import com.instagram.fileregistry.OwnerHelper;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.9lK  reason: invalid class name and case insensitive filesystem */
public final class C386889lK extends 0ng {
    public final /* synthetic */ AnonymousClass454 A00;
    public final /* synthetic */ AnonymousClass5JO A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386889lK(AnonymousClass454 r2, AnonymousClass5JO r3, String str) {
        super(272);
        this.A00 = r2;
        this.A02 = str;
        this.A01 = r3;
    }

    public final void run() {
        1W6 A002;
        ContentValues contentValues = new ContentValues();
        contentValues.put("file_path", this.A02);
        StringWriter stringWriter = new StringWriter();
        try {
            A002 = this.A00.A06.A00("fileRegistry_register");
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            OwnerHelper.A00.A02(A0A, this.A01);
            A0A.close();
            contentValues.put("owner_json", stringWriter.toString());
            A002.CNQ(contentValues, "file_registry", 0);
            A002.close();
            return;
        } catch (IOException unused) {
            0wb.A03("file_registry_save", "Failed to serialize owner");
            return;
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
        }
        throw th;
    }
}
