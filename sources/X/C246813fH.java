package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.widget.PopupWindow;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.3fH  reason: invalid class name and case insensitive filesystem */
public final class C246813fH {
    public PopupWindow A00;
    public String A01;

    /* JADX WARNING: type inference failed for: r4v2, types: [X.EKE] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.graphics.Rect r30, android.view.ViewParent r31, androidx.fragment.app.FragmentActivity r32, X.AnonymousClass4DH r33, X.AnonymousClass0iw r34, com.instagram.common.session.UserSession r35, X.1Xj r36, X.AnonymousClass4DU r37, X.2FW r38, java.lang.Integer r39, int r40, long r41) {
        /*
            r29 = this;
            r3 = r29
            android.widget.PopupWindow r0 = r3.A00
            if (r0 != 0) goto L_0x0045
            r11 = r36
            if (r36 == 0) goto L_0x0060
            java.lang.String r0 = r11.getId()
        L_0x000e:
            r3.A01 = r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326837684549668(0x810f1100003824, double:3.036576655919047E-306)
            r10 = r35
            boolean r0 = X.182.A06(r2, r10, r0)
            r5 = r30
            r6 = r31
            r7 = r32
            r9 = r34
            r14 = r39
            r15 = r40
            r16 = r41
            if (r0 == 0) goto L_0x0046
            X.EKE r4 = new X.EKE
            r8 = r33
            r12 = r37
            r13 = r38
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0038:
            r4.A00()
            X.IEC r0 = new X.IEC
            r0.<init>(r3)
            r4.setOnDismissListener(r0)
            r3.A00 = r4
        L_0x0045:
            return
        L_0x0046:
            X.EKD r4 = new X.EKD
            r18 = r4
            r19 = r7
            r20 = r5
            r21 = r6
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r14
            r26 = r15
            r27 = r16
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0038
        L_0x0060:
            r0 = 0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246813fH.A00(android.graphics.Rect, android.view.ViewParent, androidx.fragment.app.FragmentActivity, X.4DH, X.0iw, com.instagram.common.session.UserSession, X.1Xj, X.4DU, X.2FW, java.lang.Integer, int, long):void");
    }

    public final void A01(MotionEvent motionEvent, String str) {
        PopupWindow popupWindow;
        C46722Dk7 dk7;
        2HZ r1;
        int i;
        int i2;
        C46722Dk7 dk72;
        if (0qQ.A0K(this.A01, str) && (popupWindow = this.A00) != null && popupWindow.isShowing()) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2) {
                    PopupWindow popupWindow2 = this.A00;
                    if ((popupWindow2 instanceof C46722Dk7) && (dk72 = (C46722Dk7) popupWindow2) != null) {
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY() - ((float) dk72.A0E);
                        for (F2Y f2y : dk72.A0R) {
                            FEY fey = f2y.A02;
                            PointF pointF = new PointF(fey.A00, fey.A01);
                            float f = pointF.x;
                            if (rawX > f - dk72.A0A && rawX < f + dk72.A0B) {
                                float f2 = pointF.y;
                                if (rawY > f2 - dk72.A0C && rawY < f2 + dk72.A09) {
                                    if (!f2y.A00) {
                                        f2y.A00 = true;
                                        float f3 = fey.A05;
                                        Context context = fey.A06;
                                        float dimension = context.getResources().getDimension(R.dimen.abc_select_dialog_padding_start_material);
                                        IgTextView igTextView = fey.A09;
                                        fey.A04 = igTextView.getY();
                                        FEY.A00(fey, 1.38f, 1.38f);
                                        igTextView.setTextSize(context.getResources().getDimension(R.dimen.group_mention_sticker_title_text_size_step));
                                        FEY.A01(fey, 5.0f, 5.0f, (fey.A04 - ((1.38f * f3) - f3)) - dimension);
                                        AnonymousClass2S0.A01.A03();
                                    }
                                }
                            }
                            if (f2y.A00) {
                                f2y.A00 = false;
                                FEY.A00(fey, 1.0f, 1.0f);
                                FEY.A01(fey, 0.0f, 0.0f, fey.A04);
                            }
                        }
                        return;
                    }
                    return;
                } else if (action != 3) {
                    return;
                }
            }
            PopupWindow popupWindow3 = this.A00;
            if ((popupWindow3 instanceof C46722Dk7) && (dk7 = (C46722Dk7) popupWindow3) != null) {
                dk7.A02(System.currentTimeMillis() - dk7.A0F);
                dk7.A07 = true;
                boolean A002 = C48874Ela.A00(dk7.A0P);
                List list = dk7.A0R;
                if (A002) {
                    r1 = new 2HZ(list.size(), 1, -1);
                } else {
                    r1 = new 2HY(1, list.size());
                }
                int i3 = r1.A00;
                int i4 = r1.A01;
                int i5 = r1.A02;
                if (i5 <= 0 ? !(i5 >= 0 || i4 > i3) : i3 <= i4) {
                    while (true) {
                        if (A002) {
                            i2 = i3 - 1;
                            i = Math.abs(list.size() - i2);
                        } else {
                            i = i3 - 1;
                            i2 = i;
                        }
                        long j = (long) (i * 10);
                        F2Y f2y2 = (F2Y) list.get(i2);
                        if (f2y2.A00) {
                            FEY fey2 = f2y2.A02;
                            FEY.A00(fey2, 1.0f, 1.0f);
                            FEY.A01(fey2, 0.0f, 0.0f, fey2.A04);
                        }
                        f2y2.A02.A07.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setStartDelay(j).setDuration(200).start();
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    }
                }
                AnonymousClass2S0.A01.A03();
                2cs r12 = dk7.A05;
                if (r12 != null) {
                    r12.A06(0.0d);
                    2cs r6 = dk7.A05;
                    if (r6 != null) {
                        if (r6.A09.A00 == 0.0d) {
                            dk7.DmC(r6);
                            return;
                        }
                        return;
                    }
                }
                0qQ.A0F("spring");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }
}
