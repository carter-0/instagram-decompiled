package X;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.S6q  reason: case insensitive filesystem */
public final class C11038S6q {
    public ArrayList A00;
    public ArrayList A01;
    public final Intent A02 = Pxe.A0E();

    public final void A03(byte[] bArr, int i, int i2) {
        0qQ.A0B(bArr, 2);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putInt("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER_NUM_HASHES", i);
        A0a.putInt("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER_NUM_BITS", i2);
        A0a.putByteArray("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER_BITS", bArr);
        this.A02.putExtra("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER", A0a);
    }

    public final Intent A00() {
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            this.A02.putParcelableArrayListExtra("BrowserLiteIntent.EXTRA_MENU_ITEMS", arrayList);
        }
        ArrayList arrayList2 = this.A00;
        if (arrayList2 != null) {
            this.A02.putParcelableArrayListExtra("BrowserLiteIntent.EXTRA_COOKIES", arrayList2);
        }
        return this.A02;
    }

    public final void A01(String str, String str2, int i) {
        if (this.A01 == null) {
            this.A01 = AnonymousClass7TE.A1C();
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("KEY_LABEL", str);
        A0a.putInt("KEY_ICON_RES", i);
        A0a.putString("action", str2);
        ArrayList arrayList = this.A01;
        0qQ.A0A(arrayList);
        arrayList.add(A0a);
    }

    public final void A02(String str, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("KEY_URL", str);
            A0a.putStringArrayList("KEY_STRING_ARRAY", arrayList);
            ArrayList arrayList2 = this.A00;
            if (arrayList2 == null) {
                arrayList2 = AnonymousClass7TE.A1C();
                this.A00 = arrayList2;
            }
            arrayList2.add(A0a);
        }
    }
}
