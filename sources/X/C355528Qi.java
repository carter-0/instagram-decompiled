package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.8Qi  reason: invalid class name and case insensitive filesystem */
public final class C355528Qi extends C355538Qj {
    public int A00;
    public C380599Yu A01;
    public final int A02;
    public final AnonymousClass0iw A03;
    public final C328787Gf A04;
    public final C355478Qd A05;
    public final AnonymousClass8QZ A06;

    public C355528Qi(AnonymousClass0iw r2, C328787Gf r3, C355478Qd r4, AnonymousClass8QZ r5, int i) {
        0qQ.A0B(r4, 4);
        this.A03 = r2;
        this.A06 = r5;
        this.A04 = r3;
        this.A05 = r4;
        this.A02 = i;
    }

    public final boolean canDropOver(RecyclerView recyclerView, C249703kE r3, C249703kE r4) {
        0qQ.A0B(r4, 2);
        return !(r4 instanceof C380439Ye);
    }

    public final boolean isLongPressDragEnabled() {
        return false;
    }

    public final boolean onMove(RecyclerView recyclerView, C249703kE r6, C249703kE r7) {
        0qQ.A0B(r6, 1);
        0qQ.A0B(r7, 2);
        this.A04.Cof(r6.getBindingAdapterPosition(), r7.getBindingAdapterPosition());
        return true;
    }

    public final void onSwiped(C249703kE r1, int i) {
    }

    private final boolean A00(View view, View view2) {
        if (view2 == null || !this.A05.Cc6()) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect);
        view2.getGlobalVisibleRect(rect2);
        return rect2.contains(rect.centerX(), rect.centerY());
    }

    public final int getMovementFlags(RecyclerView recyclerView, C249703kE r4) {
        return C355538Qj.makeMovementFlags(13, 0);
    }

    /* JADX WARNING: type inference failed for: r0v29, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChildDraw(android.graphics.Canvas r15, androidx.recyclerview.widget.RecyclerView r16, X.C249703kE r17, float r18, float r19, int r20, boolean r21) {
        /*
            r14 = this;
            r9 = r17
            r0 = 0
            r7 = r15
            X.0qQ.A0B(r15, r0)
            r0 = 1
            r8 = r16
            X.0qQ.A0B(r8, r0)
            r0 = 2
            X.0qQ.A0B(r9, r0)
            r6 = r14
            r13 = r21
            if (r21 == 0) goto L_0x017f
            android.view.View r1 = r9.itemView
            r0 = 1
            X.5nL r0 = X.C294975nL.A01(r1, r0)
            X.0qQ.A07(r0)
            boolean r0 = r0.A0W()
            if (r0 != 0) goto L_0x017f
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r5 = r1.getDimensionPixelSize(r0)
            int r4 = r14.A02
            float r1 = (float) r4
            r0 = 1051371084(0x3eaaa64c, float:0.3333)
            float r1 = r1 * r0
            float r19 = r19 - r1
            float r3 = -r1
            android.view.View r0 = r9.itemView
            int r0 = r0.getTop()
            float r2 = (float) r0
            float r2 = r2 + r19
            int r1 = -r4
            int r0 = r14.A00
            int r1 = r1 - r0
            int r1 = r1 - r5
            float r0 = (float) r1
            float r0 = java.lang.Math.max(r2, r0)
            float r11 = java.lang.Math.min(r3, r0)
        L_0x0052:
            r10 = r18
            r12 = r20
            super.onChildDraw(r7, r8, r9, r10, r11, r12, r13)
            android.view.View r1 = r9.itemView
            X.0qQ.A06(r1)
            X.8Qd r3 = r14.A05
            android.widget.FrameLayout r0 = r3.A01
            boolean r4 = r14.A00(r1, r0)
            boolean r0 = r3.A04
            if (r0 == r4) goto L_0x00aa
            r3.A04 = r4
            X.2cs r2 = r3.A06
            if (r4 == 0) goto L_0x0178
            r0 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x0077:
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            r2.A06(r0)
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x008b
            X.2S0 r2 = X.AnonymousClass2S0.A01
            r0 = 20
            r2.A05(r0)
        L_0x008b:
            r1 = r9
            X.9Yu r1 = (X.C380599Yu) r1
            boolean r0 = r1.A05
            if (r0 == r4) goto L_0x00aa
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x00aa
            r1.A05 = r4
            X.2cs r2 = r1.A09
            if (r4 == 0) goto L_0x016f
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00a1:
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            r2.A06(r0)
        L_0x00aa:
            android.view.View r1 = r9.itemView
            X.0qQ.A06(r1)
            android.widget.FrameLayout r0 = r3.A00
            boolean r4 = r14.A00(r1, r0)
            boolean r0 = r3.A03
            if (r0 == r4) goto L_0x0132
            r3.A03 = r4
            X.2cs r2 = r3.A05
            if (r4 == 0) goto L_0x0168
            r0 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x00c6:
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            r2.A06(r0)
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x00da
            X.2S0 r2 = X.AnonymousClass2S0.A01
            r0 = 20
            r2.A05(r0)
        L_0x00da:
            X.9Yu r9 = (X.C380599Yu) r9
            X.0iw r2 = r14.A03
            boolean r0 = r9.A04
            if (r0 == r4) goto L_0x0132
            r9.A04 = r4
            if (r4 == 0) goto L_0x0119
            X.3oV r1 = r9.A0B
            boolean r0 = r1.CVM()
            if (r0 != 0) goto L_0x0119
            X.8Qa r6 = r9.A0C
            if (r6 == 0) goto L_0x0119
            android.view.View r4 = r1.getView()
            boolean r0 = r9 instanceof X.C388729oI
            if (r0 == 0) goto L_0x0133
            r1 = r9
            X.9oI r1 = (X.C388729oI) r1
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.8Qs r1 = r1.A01
            r0 = 0
            X.9oI r3 = new X.9oI
            r3.<init>(r4, r0, r6, r1)
        L_0x0109:
            r9.A01 = r3
            android.view.View r1 = r3.itemView
            X.0qQ.A06(r1)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r0 = r9.A0A
            int r0 = r0.getWidth()
            X.0nA.A0f(r1, r0)
        L_0x0119:
            X.9Yu r4 = r9.A01
            java.lang.String r1 = "Required value was null."
            if (r4 == 0) goto L_0x018d
            java.lang.Object r3 = r9.A02
            if (r3 == 0) goto L_0x0187
            android.graphics.Bitmap r1 = r9.A00
            boolean r0 = r9.A06
            r4.A00(r1, r2, r3, r0)
            X.2cs r2 = r9.A08
            boolean r0 = r9.A04
            double r0 = (double) r0
            r2.A06(r0)
        L_0x0132:
            return
        L_0x0133:
            boolean r0 = r9 instanceof X.C388709oG
            if (r0 == 0) goto L_0x0142
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 0
            X.9oG r3 = new X.9oG
            r3.<init>(r4, r0, r6)
            goto L_0x0109
        L_0x0142:
            boolean r0 = r9 instanceof X.C388719oH
            if (r0 == 0) goto L_0x0158
            r1 = r9
            X.9oH r1 = (X.C388719oH) r1
            r0 = 0
            X.0qQ.A0B(r4, r0)
            int r7 = r1.A01
            int r8 = r1.A00
            r5 = 0
            X.9oH r3 = new X.9oH
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0109
        L_0x0158:
            r1 = r9
            X.9oJ r1 = (X.C388739oJ) r1
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.8Qr r1 = r1.A02
            r0 = 0
            X.9oJ r3 = new X.9oJ
            r3.<init>(r4, r0, r1, r6)
            goto L_0x0109
        L_0x0168:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00c6
        L_0x016f:
            r0 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x00a1
        L_0x0178:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0077
        L_0x017f:
            android.view.View r0 = r9.itemView
            float r11 = r0.getTranslationY()
            goto L_0x0052
        L_0x0187:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x018d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355528Qi.onChildDraw(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, X.3kE, float, float, int, boolean):void");
    }

    public final void onSelectedChanged(C249703kE r14, int i) {
        C380599Yu r142 = (C380599Yu) r14;
        C380599Yu r3 = this.A01;
        if (r3 == null) {
            if (r142 != null && i == 2) {
                r142.A01(true);
            }
        } else if (r142 == null && i == 0) {
            View view = r3.itemView;
            0qQ.A06(view);
            C355478Qd r2 = this.A05;
            boolean A002 = A00(view, r2.A01);
            View view2 = r3.itemView;
            if (A002) {
                view2.setVisibility(8);
                B26 b26 = r2.A02;
                if (b26 != null) {
                    b26.Du0();
                }
            } else {
                0qQ.A06(view2);
                if (A00(view2, r2.A00)) {
                    B26 b262 = r2.A02;
                    if (b262 != null) {
                        b262.DBC();
                    }
                    r3.A01(false);
                } else {
                    r3.A01(false);
                    AnonymousClass8QZ r5 = this.A06;
                    if (r5.A01 != r5.A02 && r5.A00 == 5) {
                        UserSession userSession = r5.A0O;
                        27r A012 = 27p.A01(userSession);
                        long j = (long) r5.A01;
                        long j2 = (long) r5.A02;
                        C59725JVj jVj = C59725JVj.GALLERY;
                        29Z r8 = A012.A0F;
                        0wc r9 = r8.A01;
                        0Aj A003 = r9.A00(r9.A00, "ig_camera_ui_tool_click");
                        if (A003.isSampled()) {
                            A003.A8M(AnonymousClass80P.REORDER, "tool_type");
                            A003.AAJ("legacy_falco_event_name", "IG_CAMERA_CLIPS_EDIT_REORDER_SEGMENT");
                            AnonymousClass283 r7 = r8.A04;
                            String str = r7.A0L;
                            if (str == null) {
                                str = "";
                            }
                            A003.AAJ("camera_session_id", str);
                            A003.A8M(r7.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                            A003.A8k("event_type", 2);
                            A003.A8M(jVj, "surface");
                            A003.AAJ("module", 27x.A08.getModuleName());
                            A003.A9F("prev_index", Long.valueOf(j));
                            A003.A9F("new_index", Long.valueOf(j2));
                            A003.A8M(r8.A0J(), "camera_destination");
                            A003.A8M(r8.A0I(), "capture_type");
                            A003.A8M(r7.A0A, "media_type");
                            A003.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                            A003.AAK(2AL.A07(r8.A00, r8.A03), "system_info");
                            A003.A7p("is_panavision", Boolean.valueOf(r7.A0W));
                            A003.Cgf();
                        }
                        C379469Ua A004 = AnonymousClass9T6.A00(userSession);
                        A004.A01.add(new C61015JvF("VIDEO", "REORDER", "GALLERY_BOTTOM_EDITOR"));
                    }
                    r5.A01 = -1;
                    r5.A02 = -1;
                }
            }
            AnonymousClass8QZ r22 = this.A06;
            if (r22.A00 == 5) {
                r22.A06.CLA();
            }
        }
        this.A01 = r142;
    }
}
