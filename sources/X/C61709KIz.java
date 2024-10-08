package X;

import android.app.Activity;
import android.content.ClipData;
import android.net.Uri;
import com.instagram.common.gallery.Medium;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.KIz  reason: case insensitive filesystem */
public final class C61709KIz extends 0ng {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ ClipData A01;
    public final /* synthetic */ AnonymousClass7JA A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61709KIz(Activity activity, ClipData clipData, AnonymousClass7JA r6) {
        super(1403800032, 3, false, false);
        this.A00 = activity;
        this.A01 = clipData;
        this.A02 = r6;
    }

    public final void run() {
        Uri uri;
        String type;
        int i;
        Activity activity = this.A00;
        ClipData clipData = this.A01;
        AnonymousClass7JA r9 = this.A02;
        ArrayList A1C = AnonymousClass7TE.A1C();
        int itemCount = clipData.getItemCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < itemCount) {
                ClipData.Item itemAt = clipData.getItemAt(i2);
                if (itemAt == null || (uri = itemAt.getUri()) == null || (type = activity.getContentResolver().getType(uri)) == null) {
                    break;
                }
                if (!0sr.A1P(Arrays.copyOf(AnonymousClass7JB.A00, 3)).contains(type)) {
                    if (!0sr.A1P(Arrays.copyOf(AnonymousClass7JB.A01, 1)).contains(type)) {
                        break;
                    }
                    i = 3;
                } else {
                    i = 1;
                }
                Medium A002 = C282665Eg.A00(activity, uri, i);
                if (A002 == null) {
                    break;
                } else if (((long) A002.A03) > 90000) {
                    z = true;
                    break;
                } else {
                    A1C.add(A002);
                    i2++;
                }
            } else {
                break;
            }
        }
        11Z.A02(new C66042M9b(clipData, r9, A1C, z));
    }
}
