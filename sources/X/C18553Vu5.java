package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.Vu5  reason: case insensitive filesystem */
public final class C18553Vu5 {
    public static final String[] A02 = {"_id", "contact_id", "deleted", "mimetype", "data1", "data2", "data3"};
    public final Context A00;
    public final C17790Vg2 A01;

    public final C14972UHq A00() {
        Context context = this.A00;
        if (context.checkCallingOrSelfPermission("android.permission.READ_CONTACTS") != 0) {
            return null;
        }
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Uri uri = ContactsContract.RawContactsEntity.CONTENT_URI;
            String[] strArr = A02;
            0Um.A00(uri.getAuthority(), 0, AnonymousClass05K.A01);
            Cursor query = contentResolver.query(uri, strArr, (String) null, (String[]) null, "contact_id");
            if (query == null) {
                return null;
            }
            try {
                return new C14972UHq(query);
            } catch (Exception unused) {
                query.close();
                Bundle bundle = new Bundle(1);
                bundle.putString(TraceFieldType.FailureReason, "contacts_iterator_cursor_null");
                this.A01.A00(bundle);
                return null;
            }
        } catch (Exception unused2) {
            Bundle bundle2 = new Bundle(1);
            bundle2.putString(TraceFieldType.FailureReason, "contacts_iterator_cursor_null");
            this.A01.A00(bundle2);
            return null;
        }
    }

    public C18553Vu5(Context context, C17790Vg2 vg2) {
        this.A00 = context;
        this.A01 = vg2;
    }
}
