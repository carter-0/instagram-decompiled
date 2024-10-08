package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1;
import com.instagram.bugreporter.BugReporterDrawingView;
import java.util.List;

/* renamed from: X.K4v  reason: case insensitive filesystem */
public final class C61377K4v extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ImageAnnotationFragment";
    public BugReportComposerFragment$onClickScreenshotThumbnail$1 A00;
    public BugReporterDrawingView A01;
    public C74547Pwg A02;
    public Q8d A03;
    public String A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06 = C227642jf.A01(this);

    public final String getModuleName() {
        return "bugreporter_imageannotation";
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final void configureActionBar(2da r4) {
        C59922Jbl A002 = C59922Jbl.A00(r4);
        C59922Jbl.A02(DbV.A05(this), A002, 2131954328);
        A002.A01 = new LY1(this, 13);
        r4.ErM(new C59904JbT(A002));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1238735364);
        C61377K4v.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = C320236s2.A01(requireArguments, "ImageAnnotationFragment.imagePath");
        AnonymousClass0wW session = getSession();
        0qQ.A0B(session, 1);
        C74547Pwg A002 = C70853OOi.A00(requireArguments, session);
        if (A002 instanceof C71845Orm) {
            A002 = C70853OOi.A01(session);
        }
        this.A02 = A002;
        AnonymousClass0fD.A09(-308083909, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0036, code lost:
        if (r0 == false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r14, android.view.ViewGroup r15, android.os.Bundle r16) {
        /*
            r13 = this;
            r0 = -1399108374(0xffffffffac9b4cea, float:-4.413904E-12)
            int r11 = X.AnonymousClass0fD.A02(r0)
            r6 = 0
            X.0qQ.A0B(r14, r6)
            X.0eM r5 = r13.A05
            r5.getValue()
            X.02m r2 = X.C51965G9l.A0l()
            com.instagram.common.session.UserSession r1 = X.DbW.A0S(r5, r6)
            X.L3U r0 = new X.L3U
            r0.<init>(r1)
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r4 = X.0Tu.A05
            r0 = 36325068158022230(0x810d7500003256, double:3.0354576002177835E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 == 0) goto L_0x0038
            r0 = 36325068158087767(0x810d7500013257, double:3.0354576002592294E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            r3 = 1
            if (r0 != 0) goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            java.lang.String r0 = "image_redaction"
            java.lang.String r10 = "source"
            r9 = 2
            X.0eP r1 = X.AnonymousClass7TE.A1L(r10, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            java.lang.String r8 = "is_image_redaction_enabled"
            java.util.LinkedHashMap r1 = X.DbY.A0p(r8, r0, r1)
            r7 = 391252450(0x175209e2, float:6.7867133E-25)
            r2.markerStart(r7, r6)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x005b
            X.C67571Mq5.A00(r2, r1, r7)
        L_0x005b:
            X.Pwg r1 = r13.A02
            if (r1 != 0) goto L_0x0069
            java.lang.String r0 = "userFlowLoggerV2"
        L_0x0061:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0069:
            java.lang.String r0 = "image_annotation_start"
            r1.AVy(r0)
            java.lang.String r0 = r13.A04
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "imagePath"
            goto L_0x0061
        L_0x0075:
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r0)
            r12 = 1
            if (r15 == 0) goto L_0x0106
            com.instagram.common.session.UserSession r1 = X.DbW.A0S(r5, r6)
            X.L3U r0 = new X.L3U
            r0.<init>(r1)
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36325068158022230(0x810d7500003256, double:3.0354576002177835E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x0106
            r0 = 36325068158087767(0x810d7500013257, double:3.0354576002592294E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x0106
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r15)
            X.Q8d r4 = new X.Q8d
            r4.<init>(r0)
            r0 = -1
            X.C51968G9o.A1D(r4, r0)
            android.graphics.Paint r8 = r4.A05
            com.instagram.common.session.UserSession r1 = X.DbW.A0S(r5, r6)
            X.L3U r0 = new X.L3U
            r0.<init>(r1)
            X.0xa r2 = r0.A01
            java.lang.String r1 = "image_annotation_paint_color"
            r0 = -256(0xffffffffffffff00, float:NaN)
            int r0 = r2.getInt(r1, r0)
            r8.setColor(r0)
            if (r3 == 0) goto L_0x00ea
            r4.setUnderlayBitmap(r3)
        L_0x00c7:
            r13.A03 = r4
            r5.getValue()
            X.02m r2 = X.C51965G9l.A0l()
            if (r3 != 0) goto L_0x00d3
            r12 = 0
        L_0x00d3:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            java.lang.String r0 = "is_image_valid"
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r1)
            X.C67571Mq5.A00(r2, r0, r7)
            r2.markerEnd(r7, r6, r9)
            r0 = 258920345(0xf6ecf99, float:1.1774288E-29)
        L_0x00e6:
            X.AnonymousClass0fD.A09(r0, r11)
            return r4
        L_0x00ea:
            android.content.Context r2 = r4.getContext()
            r1 = 2131971278(0x7f134cce, float:1.957953E38)
            java.lang.String r0 = "rageshake"
            X.C59689JTv.A01(r2, r0, r1, r6)
            androidx.fragment.app.FragmentActivity r0 = r13.getActivity()
            if (r0 == 0) goto L_0x00c7
            X.0hq r0 = r0.getSupportFragmentManager()
            if (r0 == 0) goto L_0x00c7
            r0.A0c()
            goto L_0x00c7
        L_0x0106:
            r5.getValue()
            X.02m r2 = X.C51965G9l.A0l()
            r0 = 1547(0x60b, float:2.168E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r1 = X.AnonymousClass7TE.A1L(r10, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            java.util.LinkedHashMap r1 = X.DbY.A0p(r8, r0, r1)
            r2.markerStart(r7, r6)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x012b
            X.C67571Mq5.A00(r2, r1, r7)
        L_0x012b:
            r0 = 2131624350(0x7f0e019e, float:1.8875877E38)
            android.view.View r4 = X.DbT.A0D(r14, r15, r0, r6)
            r0 = 2131432082(0x7f0b1292, float:1.8485911E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.bugreporter.BugReporterDrawingView r0 = (com.instagram.bugreporter.BugReporterDrawingView) r0
            r13.A01 = r0
            if (r0 == 0) goto L_0x0142
            r0.setUnderlayBitmap(r3)
        L_0x0142:
            r5.getValue()
            X.02m r2 = X.C51965G9l.A0l()
            if (r3 != 0) goto L_0x014c
            r12 = 0
        L_0x014c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            java.lang.String r0 = "is_image_valid"
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r1)
            X.C67571Mq5.A00(r2, r0, r7)
            r2.markerEnd(r7, r6, r9)
            r0 = 1847435240(0x6e1d9fe8, float:1.2195615E28)
            goto L_0x00e6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61377K4v.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        Bitmap bitmap;
        int A022 = AnonymousClass0fD.A02(-1908958001);
        super.onDestroyView();
        Q8d q8d = this.A03;
        if (q8d != null) {
            synchronized (q8d.A07) {
                List<LBv> list = q8d.A08;
                for (LBv lBv : list) {
                    if (lBv instanceof KBC) {
                        bitmap = ((KBC) lBv).A01;
                    } else if (lBv instanceof KBB) {
                        bitmap = ((KBB) lBv).A00;
                    }
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
                list.clear();
            }
            this.A03 = null;
        } else {
            BugReporterDrawingView bugReporterDrawingView = this.A01;
            if (bugReporterDrawingView != null) {
                bugReporterDrawingView.A01();
            }
            this.A01 = null;
        }
        AnonymousClass0fD.A09(-2011697828, A022);
    }
}
