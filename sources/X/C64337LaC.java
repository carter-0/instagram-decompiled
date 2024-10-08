package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.LaC  reason: case insensitive filesystem */
public abstract class C64337LaC implements C331097Pn {
    public final void DeF(boolean z) {
    }

    public final void DsW(MotionEvent motionEvent, RecyclerView recyclerView) {
        C249703kE r4;
        L1C l1c;
        C242243Te r0;
        String str;
        View findViewWithTag;
        float max;
        C249703kE r02;
        if (this instanceof C60480JmD) {
            C60480JmD jmD = (C60480JmD) this;
            boolean A1U = AnonymousClass7TF.A1U(0, recyclerView, motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != A1U) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return;
                    }
                } else if (C60480JmD.A00(jmD, motionEvent.getX() - jmD.A00, motionEvent.getY() - jmD.A01)) {
                    jmD.A05 = A1U;
                    JTP.A15(recyclerView, A1U);
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (jmD.A03 == null) {
                        View A0U = recyclerView.A0U(x, y);
                        if (A0U != null) {
                            r02 = recyclerView.A0Z(A0U);
                        } else {
                            r02 = null;
                        }
                        jmD.A03 = r02;
                    }
                    jmD.A02 = (motionEvent.getX() - jmD.A00) * 0.3f;
                    for (Object next : jmD.A0A) {
                        C249703kE r03 = jmD.A03;
                        View view = null;
                        if (r03 != null) {
                            view = r03.itemView;
                        }
                        if (!(!(view instanceof ViewGroup) || view == null || (findViewWithTag = view.findViewWithTag(next)) == null)) {
                            jmD.A0B.add(findViewWithTag);
                            boolean z = jmD.A0C;
                            float f = jmD.A02;
                            if (z) {
                                max = Math.min(0.0f, f);
                            } else {
                                max = Math.max(0.0f, f);
                            }
                            findViewWithTag.setTranslationX(max);
                        }
                    }
                    recyclerView.invalidate();
                } else {
                    return;
                }
            }
            if (!(Math.abs(jmD.A02) < jmD.A06 || (r4 = jmD.A03) == null || (l1c = jmD.A04) == null)) {
                int absoluteAdapterPosition = r4.getAbsoluteAdapterPosition();
                C53901Gw7 gw7 = l1c.A00;
                MQV mqv = gw7.A04;
                if (mqv instanceof C61199Jys) {
                    C333827aD r42 = (C333827aD) 00k.A0O(((C61199Jys) mqv).A03, absoluteAdapterPosition);
                    if (r42 instanceof C335907dj) {
                        C60314JjH jjH = gw7.A03;
                        C335907dj r43 = (C335907dj) r42;
                        String str2 = r43.A0K;
                        String str3 = r43.A0N;
                        C335907dj A01 = C335067cK.A01(C51968G9o.A0g(jjH.A05), str2, str3);
                        if (A01 != null) {
                            C60314JjH.A00(A01, jjH);
                            LSm lSm = jjH.A08;
                            boolean A1V = AnonymousClass7TF.A1V(str3);
                            AnonymousClass2Ep A00 = LSm.A00(lSm);
                            if (!(A00 == null || (r0 = ((AnonymousClass3U9) A00).A01.A0s) == null)) {
                                0eP A02 = LSm.A02(lSm);
                                0eP A03 = LSm.A03(lSm, r0, A00);
                                if (A1V) {
                                    str = "True";
                                } else {
                                    str = "False";
                                }
                                LinkedHashMap A0p = JTS.A0p("is_reply", str, A02, A03);
                                C313756gx A0R = DbZ.A0R(lSm.A04);
                                int AdN = A00.AdN();
                                A0R.A0W(C66579MXk.A00(280), "tap", "reply_swipe_shortcut", "comments_view", A00.C6C(), A00.C6k(), A0p, AdN);
                            }
                        }
                    }
                }
            }
            List list = jmD.A0B;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                JTO.A0H(it).setTranslationX(0.0f);
            }
            jmD.A05 = false;
            list.clear();
            jmD.A03 = null;
            JTP.A15(recyclerView, A1U);
            jmD.A02 = 0.0f;
            recyclerView.invalidate();
        }
    }
}
