package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.8XI  reason: invalid class name */
public abstract class AnonymousClass8XI implements AnonymousClass1MK {
    public static final ConcurrentHashMap A05 = new ConcurrentHashMap();
    public final int A00;
    public final int A01;
    public final BitmapFactory.Options A02;
    public final UserSession A03;
    public final C62780vc A04 = new C62780vc(0nY.A00(), Runtime.getRuntime().availableProcessors() * 2);

    public AnonymousClass8XI(UserSession userSession, int i, int i2) {
        this.A03 = userSession;
        this.A01 = i;
        this.A00 = i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        this.A02 = options;
    }

    public final void A01(B2Y b2y, Object obj) {
        String str;
        StringBuilder sb;
        String str2;
        String str3;
        if (this instanceof C387579mR) {
            C387579mR r3 = (C387579mR) this;
            C369968vc r2 = (C369968vc) obj;
            0qQ.A0B(r2, 0);
            str = C394639yR.A00(r3.A00, r2, r3.A03);
        } else {
            C369988ve r1 = (C369988ve) obj;
            0qQ.A0B(r1, 0);
            str = r1.A06;
        }
        if (str != null) {
            boolean z = false;
            if (str.length() == 0) {
                z = true;
            }
            String A002 = AnonymousClass000.A00(442);
            if (z) {
                sb = new StringBuilder();
                str2 = "Thumbnail path is empty in DraftThumbnailLoader#loadThumbnail. source: ";
            } else if (!new File(str).exists()) {
                sb = new StringBuilder();
                str2 = "Thumbnail file doesn't exist in DraftThumbnailLoader#loadThumbnail. source: ";
            } else {
                this.A04.ATE(new C386909lM(this, obj, str, new WeakReference(b2y)));
                return;
            }
            sb.append(str2);
            if (this instanceof AnonymousClass8XH) {
                str3 = "StoryDraftThumbnailLoader";
            } else {
                str3 = "ClipsDraftThumbnailLoader";
            }
            sb.append(str3);
            0kD.A06(A002, sb.toString(), (Throwable) null);
        }
    }

    public final void CyF(C226952iF r6, AnonymousClass3LX r7) {
        B2Y A002;
        String str;
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        Object C3s = r6.C3s();
        0qQ.A0C(C3s, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.drafts.DraftThumbnailLoader.CacheRequestInfo<*>");
        AnonymousClass9IV r1 = (AnonymousClass9IV) C3s;
        if (((Reference) r1.A01).get() != null && (A002 = A00(r6)) != null) {
            Object obj = r1.A00;
            if (obj == null) {
                if (this instanceof AnonymousClass8XH) {
                    str = "StoryDraftThumbnailLoader";
                } else {
                    str = "ClipsDraftThumbnailLoader";
                }
                0kD.A06(AnonymousClass000.A00(442), 002.A0R("could not cast draft object in DraftThumbnailLoader#onBitmapLoaded. source: ", str), (Throwable) null);
                return;
            }
            Bitmap bitmap = r7.A01;
            if (bitmap != null && A002.CWQ(obj)) {
                A002.DrS(bitmap, obj);
            }
        }
    }

    public final void DJx(C226952iF r2, C254673sr r3) {
        0qQ.A0B(r2, 0);
        B2Y A002 = A00(r2);
        if (A002 != null) {
            A002.DrP(r3);
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r3 == null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.B2Y A00(X.C226952iF r5) {
        /*
            r4 = this;
            java.lang.Object r1 = r5.C3s()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.drafts.DraftThumbnailLoader.CacheRequestInfo<*>"
            X.0qQ.A0C(r1, r0)
            X.9IV r1 = (X.AnonymousClass9IV) r1
            java.lang.Object r0 = r1.A01
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r3 = r0.get()
            boolean r0 = r3 instanceof X.B2Y
            r2 = 0
            if (r0 == 0) goto L_0x0035
            X.B2Y r3 = (X.B2Y) r3
            if (r3 != 0) goto L_0x0031
        L_0x001c:
            java.lang.String r1 = "could not cast cacheRequestInfo object in DraftThumbnailLoader#getThumbnailLoadListener. source: "
            boolean r0 = r4 instanceof X.AnonymousClass8XH
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = "StoryDraftThumbnailLoader"
        L_0x0024:
            java.lang.String r1 = X.002.A0R(r1, r0)
            r0 = 442(0x1ba, float:6.2E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0kD.A06(r0, r1, r2)
        L_0x0031:
            return r3
        L_0x0032:
            java.lang.String r0 = "ClipsDraftThumbnailLoader"
            goto L_0x0024
        L_0x0035:
            r3 = r2
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8XI.A00(X.2iF):X.B2Y");
    }
}
