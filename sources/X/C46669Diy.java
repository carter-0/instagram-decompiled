package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import com.instagram.android.R;

/* renamed from: X.Diy  reason: case insensitive filesystem */
public final class C46669Diy extends AsyncTask {
    public boolean A00;
    public final int A01;
    public final Uri A02;
    public final /* synthetic */ C50349FZg A03;

    public C46669Diy(Uri uri, C50349FZg fZg, int i) {
        this.A03 = fZg;
        this.A01 = i;
        this.A02 = uri;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (r4.getHeight() >= 150) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (X.C44596ChU.A00(r3.A07) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r8) {
        /*
            r7 = this;
            X.FZg r3 = r7.A03
            X.E4u r2 = r3.A02
            r6 = 0
            if (r2 == 0) goto L_0x001a
            int r5 = r7.A01
            if (r5 != 0) goto L_0x0014
            com.instagram.common.session.UserSession r0 = r3.A07
            boolean r1 = X.C44596ChU.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x001b
            r0 = 1
            r7.A00 = r0
        L_0x001a:
            return r6
        L_0x001b:
            android.content.Context r2 = r2.requireContext()     // Catch:{ Exception -> 0x005b }
            com.instagram.common.session.UserSession r1 = r3.A07     // Catch:{ Exception -> 0x005b }
            android.net.Uri r0 = r7.A02     // Catch:{ Exception -> 0x005b }
            android.graphics.Bitmap r4 = X.C64366Lai.A00(r2, r0, r1, r5)     // Catch:{ Exception -> 0x005b }
            if (r4 == 0) goto L_0x001a
            r3 = 0
            android.graphics.Bitmap r0 = X.1MF.A06(r4)     // Catch:{ Exception -> 0x005b }
            if (r4 == r0) goto L_0x0031
            r3 = r0
        L_0x0031:
            int r0 = r4.getWidth()     // Catch:{ Exception -> 0x005b }
            r2 = 1
            r1 = 1080(0x438, float:1.513E-42)
            if (r0 > r1) goto L_0x004e
            int r0 = r4.getHeight()     // Catch:{ Exception -> 0x005b }
            if (r0 > r1) goto L_0x004e
            int r0 = r4.getWidth()     // Catch:{ Exception -> 0x005b }
            r1 = 150(0x96, float:2.1E-43)
            if (r0 < r1) goto L_0x004e
            int r0 = r4.getHeight()     // Catch:{ Exception -> 0x005b }
            if (r0 >= r1) goto L_0x0052
        L_0x004e:
            android.graphics.Bitmap r3 = X.0fO.A00(r4, r1, r1, r2)     // Catch:{ Exception -> 0x005b }
        L_0x0052:
            if (r3 == 0) goto L_0x005a
            if (r5 == 0) goto L_0x0059
            r4.recycle()     // Catch:{ Exception -> 0x005b }
        L_0x0059:
            return r3
        L_0x005a:
            return r4
        L_0x005b:
            r2 = move-exception
            java.lang.String r1 = "AddAvatarHelper"
            java.lang.String r0 = "An error occurred fetching your image"
            X.0KC.A0F(r1, r0, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46669Diy.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C50349FZg fZg = this.A03;
        C47490E4u e4u = fZg.A02;
        if (!(e4u == null || e4u.mView == null)) {
            if (bitmap != null) {
                C49449Evq evq = new C49449Evq(bitmap, this.A02, this.A01);
                e4u.A03(evq.A00);
                fZg.A00 = evq;
            } else if (this.A00) {
                fZg.A00 = null;
                Drawable drawable = e4u.requireContext().getDrawable(R.drawable.profile_anonymous_user);
                if (drawable != null) {
                    e4u.A00 = null;
                    e4u.A03.A00 = null;
                    e4u.A03(((BitmapDrawable) drawable).getBitmap());
                } else {
                    throw DbU.A0h();
                }
            } else {
                C358248ab A002 = C49952FGh.A00(e4u.requireContext());
                A002.A08(2131970054);
                DbT.A1V(A002);
            }
        }
        super.onPostExecute(bitmap);
    }
}
