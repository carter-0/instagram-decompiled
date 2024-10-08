package X;

import android.app.Activity;
import android.content.ClipData;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;

public final class KJG extends 0ng {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ ClipData A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C279284yO A04;
    public final /* synthetic */ C362048hG A05;
    public final /* synthetic */ AnonymousClass8WX A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJG(Activity activity, ClipData clipData, ViewGroup viewGroup, UserSession userSession, C279284yO r8, C362048hG r9, AnonymousClass8WX r10) {
        super(1403800032, 3, false, false);
        this.A01 = clipData;
        this.A00 = activity;
        this.A03 = userSession;
        this.A02 = viewGroup;
        this.A05 = r9;
        this.A04 = r8;
        this.A06 = r10;
    }

    public final void run() {
        ClipData clipData;
        ClipData.Item itemAt;
        Uri uri;
        int i;
        ArrayList A1C = AnonymousClass7TE.A1C();
        int i2 = 0;
        while (true) {
            clipData = this.A01;
            if (i2 >= clipData.getItemCount() || (itemAt = clipData.getItemAt(i2)) == null || (uri = itemAt.getUri()) == null || uri.toString().contains("com.sec.android.gallery3d.fileprovider")) {
                break;
            }
            Activity activity = this.A00;
            String type = activity.getContentResolver().getType(uri);
            if (!2Ob.A00(type, "image/jpeg") && !2Ob.A00(type, "image/png") && !2Ob.A00(type, "image/avif")) {
                if (!2Ob.A00(type, "video/mp4")) {
                    break;
                }
                i = 3;
            } else {
                i = 1;
            }
            try {
                ParcelFileDescriptor openFileDescriptor = activity.getContentResolver().openFileDescriptor(uri, "r");
                if (openFileDescriptor != null && 0b9.A02(openFileDescriptor)) {
                    break;
                }
                Medium A002 = C282665Eg.A00(activity, uri, i);
                if (A002 != null) {
                    A1C.add(A002);
                }
                i2++;
            } catch (IOException unused) {
            }
        }
        UserSession userSession = this.A03;
        ViewGroup viewGroup = this.A02;
        C362048hG r10 = this.A05;
        11Z.A02(new MAD(this.A00, clipData, viewGroup, userSession, this.A04, r10, this.A06, A1C));
    }
}
