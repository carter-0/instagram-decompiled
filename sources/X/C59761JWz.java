package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.crop.CropImageView;
import com.instagram.creation.photo.util.ExifImageData;
import com.instagram.model.creation.MediaCaptureConfig;
import java.io.File;

/* renamed from: X.JWz  reason: case insensitive filesystem */
public final class C59761JWz {
    public static final int A0D = C228922mY.A00.getAndIncrement();
    public Bitmap A00;
    public RectF A01;
    public CropInfo A02;
    public JX0 A03;
    public ExifImageData A04;
    public C364808m2 A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final Handler A0A = new Handler();
    public final UserSession A0B;
    public final AnonymousClass0vF A0C = JTP.A0W(C61610nw.A00(), "cropImageExecutor");

    /* JADX WARNING: type inference failed for: r10v0, types: [X.JVz, com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    public final void A02(Context context, MediaUploadMetadata mediaUploadMetadata) {
        JX0 jx0;
        ? r10;
        RectF rectF;
        ExifImageData exifImageData;
        boolean z;
        FragmentActivity fragmentActivity;
        FragmentActivity fragmentActivity2;
        ExifImageData exifImageData2;
        C267844cJ r1;
        C3499582p Ajn;
        String AvM;
        FragmentActivity fragmentActivity3;
        C3499582p r5;
        C267844cJ r52;
        C364808m2 r9 = this.A05;
        if (r9 != null && !this.A07 && (jx0 = this.A03) != null && (r10 = jx0.A05) != 0 && r10.A04 != null) {
            r10.A0H();
            Bitmap bitmap = this.A00;
            if (bitmap != null && (rectF = this.A01) != null && (exifImageData = this.A04) != null) {
                int width = r9.getWidth();
                int height = r9.getHeight();
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                int i = exifImageData.A00;
                JX0 jx02 = this.A03;
                if (jx02 != null) {
                    z = jx02.A09;
                } else {
                    z = false;
                }
                if (r10.A0G.A01 != null || !z) {
                    rectF = C59892JbH.A00(rectF, r10, width2, height2, i);
                }
                Rect A052 = JW0.A05(rectF);
                Rect A022 = JW0.A02(A052);
                Rect A062 = JW0.A06(rectF, width, height, width2, height2);
                if (A052.width() == A052.height() && A062.width() != A062.height()) {
                    A062 = JW0.A02(A062);
                    A052 = A022;
                }
                if (LIa.A01(A062, A052, i)) {
                    this.A07 = true;
                    JX0 jx03 = this.A03;
                    FragmentActivity fragmentActivity4 = null;
                    if (jx03 != null) {
                        fragmentActivity = jx03.A03;
                    } else {
                        fragmentActivity = null;
                    }
                    if (fragmentActivity instanceof C267844cJ) {
                        if (jx03 != null) {
                            fragmentActivity3 = jx03.A03;
                        } else {
                            fragmentActivity3 = null;
                        }
                        if (!(fragmentActivity3 instanceof C267844cJ) || (r52 = (C267844cJ) fragmentActivity3) == null) {
                            r5 = null;
                        } else {
                            r5 = r52.Ajn();
                        }
                        C59953JcJ.A00(this.A0B).A08(r5);
                    }
                    C364808m2 r0 = this.A05;
                    if (!(r0 == null || (AvM = r0.AvM()) == null)) {
                        this.A0C.ATE(new C386729l4(this, AvM));
                    }
                    U02 u02 = r10.A01;
                    if (u02 != null) {
                        u02.A02();
                        r10.setOnTouchListener((View.OnTouchListener) null);
                        r10.A01 = null;
                    }
                    r10.A04 = null;
                    C59953JcJ.A00(this.A0B).A03(context, new CropInfo(A022, bitmap.getWidth(), bitmap.getHeight()), r9.AvM(), exifImageData.A00, false);
                    this.A02 = new CropInfo(A062, r9.getWidth(), r9.getHeight());
                    String AvM2 = r9.AvM();
                    if (AvM2 != null) {
                        JX0 jx04 = this.A03;
                        if (jx04 != null) {
                            fragmentActivity2 = jx04.A03;
                        } else {
                            fragmentActivity2 = null;
                        }
                        if (fragmentActivity2 instanceof C267854cK) {
                            if (jx04 != null) {
                                fragmentActivity4 = jx04.A03;
                            }
                            if (!(!(fragmentActivity4 instanceof C267844cJ) || (r1 = (C267844cJ) fragmentActivity4) == null || (Ajn = r1.Ajn()) == null)) {
                                CreationSession A012 = JWE.A01(Ajn);
                                A012.A03 = bitmap;
                                A012.A04 = A052;
                                MediaCaptureConfig mediaCaptureConfig = A012.A09;
                                if (mediaCaptureConfig != null && mediaCaptureConfig.A0E) {
                                    RectF A072 = JW0.A07(A062);
                                    int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                                    Bitmap A0C2 = 1MF.A0C(bitmap, A072, min, min);
                                    0qQ.A07(A0C2);
                                    File A042 = 0mb.A04(fragmentActivity2);
                                    1MF.A0M(A0C2, A042);
                                    this.A02 = new CropInfo(JTS.A08(A0C2), A0C2.getWidth(), A0C2.getHeight());
                                    AvM2 = A042.getPath();
                                }
                            }
                        }
                        JX0 jx05 = this.A03;
                        if (jx05 != null && (exifImageData2 = this.A04) != null && jx05.A04 != null) {
                            Location location = null;
                            Double d = exifImageData2.A01;
                            Double d2 = exifImageData2.A02;
                            if (!(d == null || d2 == null)) {
                                location = new Location("photo");
                                location.setLatitude(d.doubleValue());
                                location.setLongitude(d2.doubleValue());
                            }
                            C273544ml r6 = jx05.A04;
                            if (r6 != null) {
                                CropInfo cropInfo = this.A02;
                                int i2 = exifImageData2.A00;
                                r6.DFf(location, jx05.A01, mediaUploadMetadata, cropInfo, AvM2, jx05.A08, exifImageData2.A03, i2, jx05.A00);
                            }
                        }
                    }
                }
            }
        }
    }

    public final CropInfo A00() {
        C364808m2 r4;
        JX0 jx0;
        CropImageView cropImageView;
        ExifImageData exifImageData;
        boolean z;
        Bitmap bitmap = this.A00;
        if (bitmap == null || (r4 = this.A05) == null || (jx0 = this.A03) == null || (cropImageView = jx0.A05) == null) {
            return null;
        }
        cropImageView.A0H();
        int width = r4.getWidth();
        int height = r4.getHeight();
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        RectF rectF = this.A01;
        if (rectF == null || (exifImageData = this.A04) == null) {
            return null;
        }
        int i = exifImageData.A00;
        JX0 jx02 = this.A03;
        if (jx02 != null) {
            z = jx02.A09;
        } else {
            z = false;
        }
        if (cropImageView.A0G.A01 != null || !z) {
            rectF = C59892JbH.A00(rectF, cropImageView, width2, height2, i);
        }
        Rect A052 = JW0.A05(rectF);
        JW0.A02(A052);
        Rect A062 = JW0.A06(rectF, width, height, width2, height2);
        if (A052.width() == A052.height() && A062.width() != A062.height()) {
            A062 = JW0.A02(A062);
        }
        return new CropInfo(A062, r4.getWidth(), r4.getHeight());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000f: MOVE  (r1v2 X.4cJ) = (r1v1 X.4cJ)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void A01() {
        /*
            r3 = this;
            X.JX0 r0 = r3.A03
            r2 = 0
            if (r0 == 0) goto L_0x002b
            androidx.fragment.app.FragmentActivity r1 = r0.A03
            boolean r0 = r1 instanceof X.C3499682q
            if (r0 == 0) goto L_0x002b
            boolean r0 = r1 instanceof X.C267844cJ
            if (r0 == 0) goto L_0x002b
            X.4cJ r1 = (X.C267844cJ) r1
            if (r1 == 0) goto L_0x002b
            X.82p r0 = r1.Ajn()
            if (r0 == 0) goto L_0x002b
            X.82q r0 = r0.A00()
            r1 = 1
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            com.instagram.model.creation.MediaCaptureConfig r0 = r0.A09
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.A0B
            if (r0 != r1) goto L_0x002b
            r2 = 1
        L_0x002b:
            r3.A08 = r2
            r0 = 0
            r3.A06 = r0
            X.JaY r2 = new X.JaY
            r2.<init>(r3)
            X.JX0 r0 = r3.A03
            if (r0 == 0) goto L_0x0046
            androidx.fragment.app.FragmentActivity r0 = r0.A03
            if (r0 == 0) goto L_0x0046
            X.0gy r1 = X.AnonymousClass07i.A00(r0)
            int r0 = A0D
            r1.A04(r2, r0)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59761JWz.A01():void");
    }

    public C59761JWz(Context context, UserSession userSession) {
        this.A09 = context;
        this.A0B = userSession;
    }
}
