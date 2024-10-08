package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Odj  reason: case insensitive filesystem */
public final class C71139Odj {
    public View.OnLayoutChangeListener A00;
    public C70509O9i A01;
    public C69378NkI A02;
    public Integer A03;
    public List A04;
    public boolean A05;
    public final Context A06;
    public final View A07;
    public final UserSession A08;
    public final ReboundHorizontalScrollView A09;
    public final AnonymousClass8DM A0A;
    public final 1Av A0B;
    public final OKY A0C;
    public final C70753OJz A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final Map A0I = AnonymousClass7TE.A1H();
    public final Map A0J = AnonymousClass7TE.A1H();
    public final Set A0K;

    public final void A07(AnonymousClass87G r10, C69378NkI nkI) {
        C69378NkI nkI2;
        0qQ.A0B(nkI, 1);
        AnonymousClass87G r7 = AnonymousClass87G.A0T;
        if (r10.equals(r7) || nkI == A01(r10, this)) {
            Map map = this.A0I;
            if (!0qQ.A0K(map.get(nkI), r10)) {
                map.put(nkI, r10);
                AnonymousClass8DM r5 = this.A0A;
                if (!0qQ.A0K(r5.Bre(), r10) && nkI == this.A02) {
                    r5.EwC(r10);
                }
                C69378NkI nkI3 = C69378NkI.FILTER;
                if (nkI != nkI3 && nkI != (nkI2 = C69378NkI.AVATAR_BACKGROUND)) {
                    for (Object next : this.A04) {
                        if (!(next == nkI || next == nkI3 || next == nkI2)) {
                            AnonymousClass87G r0 = null;
                            if (r10.equals(r7)) {
                                r0 = r7;
                            }
                            map.put(next, r0);
                            C69378NkI nkI4 = this.A02;
                            if (next == nkI4) {
                                if (map.get(nkI4) == null) {
                                    r5.EI0();
                                } else {
                                    r5.EwC((AnonymousClass87G) map.get(this.A02));
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        0wb.A03("RtcArEffectPickerTabController", "Element type doesn't match with tab type.");
    }

    private final IgTextView A00(int i) {
        View childAt = this.A09.getChildAt(i);
        if (!(childAt instanceof ViewGroup) || childAt == null) {
            return null;
        }
        return childAt.findViewById(R.id.label_text);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r0 = r4.A0J;
        r1 = X.C69378NkI.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C69378NkI A01(X.AnonymousClass87G r3, X.C71139Odj r4) {
        /*
            X.87I r1 = r3.A04
            if (r1 != 0) goto L_0x0006
            X.87I r1 = X.AnonymousClass87I.EMPTY
        L_0x0006:
            X.87I r0 = X.AnonymousClass87I.FILTER
            if (r1 != r0) goto L_0x000d
            X.NkI r1 = X.C69378NkI.FILTER
            return r1
        L_0x000d:
            com.instagram.camera.effect.models.CameraAREffect r0 = r3.A00()
            r2 = 1
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.A0M()
            if (r0 != r2) goto L_0x002b
            java.util.Map r0 = r4.A0J
            X.NkI r1 = X.C69378NkI.MULTIPEER
            java.util.List r0 = X.C66580MXl.A13(r1, r0)
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.contains(r3)
            if (r0 != r2) goto L_0x002b
            return r1
        L_0x002b:
            X.87I r1 = r3.A04
            X.87I r0 = X.AnonymousClass87I.AVATAR_BACKGROUND
            if (r1 == r0) goto L_0x005e
            X.87I r0 = X.AnonymousClass87I.EMPTY_AVATAR_BACKGROUND
            if (r1 == r0) goto L_0x005e
            X.87I r0 = X.AnonymousClass87I.AVATAR_EFFECT
            if (r1 == r0) goto L_0x0043
            X.87I r0 = X.AnonymousClass87I.AVATAR_PLACEHOLDER
            if (r1 == r0) goto L_0x0043
            com.instagram.camera.effect.models.CameraAREffect r0 = r3.A00()
            if (r0 == 0) goto L_0x004a
        L_0x0043:
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x004a
            X.NkI r1 = X.C69378NkI.AVATAR
            return r1
        L_0x004a:
            java.util.Map r0 = r4.A0J
            X.NkI r1 = X.C69378NkI.SOLO_BACKGROUNDS
            java.util.List r0 = X.C66580MXl.A13(r1, r0)
            if (r0 == 0) goto L_0x005b
            boolean r0 = r0.contains(r3)
            if (r0 != r2) goto L_0x005b
            return r1
        L_0x005b:
            X.NkI r1 = X.C69378NkI.EFFECT
            return r1
        L_0x005e:
            X.NkI r1 = X.C69378NkI.AVATAR_BACKGROUND
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71139Odj.A01(X.87G, X.Odj):X.NkI");
    }

    public static final List A02(C71139Odj odj) {
        int intValue = odj.A03.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                return odj.A0H;
            }
            if (intValue == 3) {
                return odj.A0F;
            }
            if (intValue != 2) {
                return odj.A0E;
            }
        }
        return odj.A0G;
    }

    public static final void A04(C71139Odj odj) {
        int i;
        int i2;
        ReboundHorizontalScrollView reboundHorizontalScrollView = odj.A09;
        reboundHorizontalScrollView.removeAllViews();
        for (C69378NkI nkI : A02(odj)) {
            Context context = odj.A06;
            View inflate = View.inflate(context, R.layout.ar_effect_picker_tab_label, (ViewGroup) null);
            C66580MXl.A1R(inflate);
            TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.label_text);
            View findViewById = inflate.findViewById(R.id.badge);
            switch (nkI.ordinal()) {
                case 0:
                    i = 2131962637;
                    break;
                case 1:
                    i = 2131962453;
                    break;
                case 2:
                    i = 2131962636;
                    break;
                case 3:
                    i = 2131974092;
                    break;
                case 4:
                    i = 2131953544;
                    break;
                case 5:
                    i = 2131953415;
                    break;
                default:
                    throw C51973G9u.A0g(nkI, "Unknown tab type: ", AnonymousClass7TE.A1A());
            }
            C66581MXm.A15(context, A0d, i);
            if (nkI == C69378NkI.MULTIPEER) {
                1Av r3 = odj.A0B;
                i2 = 0;
                if (!AnonymousClass7TG.A1a(r3, r3.A1X, 1Av.A8a, 238)) {
                    findViewById.setVisibility(i2);
                    reboundHorizontalScrollView.addView(inflate);
                }
            }
            i2 = 8;
            findViewById.setVisibility(i2);
            reboundHorizontalScrollView.addView(inflate);
        }
        0nA.A0q(odj.A07, new C73116PWx(odj));
    }

    public static final void A05(C71139Odj odj, int i, int i2) {
        if (i != i2) {
            IgTextView A002 = odj.A00(i2);
            if (A002 != null) {
                A002.post(new C73335Pau(odj, i, i2));
            }
            C69378NkI nkI = (C69378NkI) A02(odj).get(i2);
            if (odj.A02 != nkI) {
                odj.A02 = nkI;
                AnonymousClass8DM r1 = odj.A0A;
                r1.EBJ();
                0sn A13 = C66580MXl.A13(nkI, odj.A0J);
                if (A13 == null) {
                    A13 = 0sn.A00;
                }
                r1.EUw(A13);
            }
        }
    }

    public static final void A06(C71139Odj odj, int i, int i2, boolean z) {
        C69378NkI nkI;
        View findViewById;
        if (!z) {
            odj.A09.A08(i2);
        }
        ReboundHorizontalScrollView reboundHorizontalScrollView = odj.A09;
        int childCount = reboundHorizontalScrollView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            IgTextView A002 = odj.A00(i3);
            if (A002 != null) {
                A002.setAlpha(0.5f);
            }
        }
        IgTextView A003 = odj.A00(i2);
        if (A003 != null) {
            A003.setTypeface((Typeface) null, 1);
            A003.setAlpha(1.0f);
        }
        IgTextView A004 = odj.A00(i);
        if (A004 != null) {
            A004.setTypeface((Typeface) null, 0);
            A004.setAlpha(0.5f);
        }
        View childAt = reboundHorizontalScrollView.getChildAt(i2);
        if ((childAt instanceof ViewGroup) && childAt != null && (findViewById = childAt.findViewById(R.id.badge)) != null && findViewById.getVisibility() == 0) {
            1Av r5 = odj.A0B;
            AnonymousClass7TF.A1J(r5, r5.A1X, 1Av.A8a, 238, true);
            View childAt2 = reboundHorizontalScrollView.getChildAt(i2);
            if ((childAt2 instanceof ViewGroup) && childAt2 != null) {
                AnonymousClass7TH.A0R(childAt2.findViewById(R.id.badge));
            }
        }
        View childAt3 = reboundHorizontalScrollView.getChildAt(i);
        if ((childAt3 instanceof ViewGroup) && childAt3 != null) {
            childAt3.setSelected(false);
        }
        View childAt4 = reboundHorizontalScrollView.getChildAt(i2);
        if ((childAt4 instanceof ViewGroup) && childAt4 != null) {
            childAt4.setSelected(true);
        }
        if (i2 >= A02(odj).size()) {
            nkI = O2I.A00(odj.A03);
        } else {
            nkI = (C69378NkI) A02(odj).get(i2);
        }
        if (odj.A02 != nkI) {
            odj.A02 = nkI;
            AnonymousClass8DM r2 = odj.A0A;
            r2.EBJ();
            0sn A13 = C66580MXl.A13(nkI, odj.A0J);
            if (A13 == null) {
                A13 = 0sn.A00;
            }
            r2.EUw(A13);
        }
        Map map = odj.A0I;
        Object obj = map.get(odj.A02);
        AnonymousClass8DM r1 = odj.A0A;
        if (obj == null) {
            r1.EI0();
        } else {
            r1.EwC((AnonymousClass87G) map.get(odj.A02));
        }
        C70509O9i o9i = odj.A01;
        if (o9i != null) {
            C69378NkI nkI2 = odj.A02;
            0qQ.A0B(nkI2, 0);
            C69112Ner ner = o9i.A00;
            C69112Ner.A05(ner);
            if (ner.A03.A07 != nkI2) {
                ner.A0H.A03(new C72910POu(nkI2));
                ner.A0G.A00(new C72782PJw(nkI2.A00(ner.A06)));
                return;
            }
            return;
        }
        0qQ.A0F("listener");
        throw AnonymousClass00P.createAndThrow();
    }

    public /* synthetic */ C71139Odj(Context context, View view, UserSession userSession, AnonymousClass8DM r9, OKY oky, C70753OJz oJz, C69378NkI nkI, List list, List list2) {
        ReboundHorizontalScrollView reboundHorizontalScrollView = (ReboundHorizontalScrollView) view.findViewById(R.id.ar_effect_picker_tab_scroll_view);
        1Av A002 = 1Au.A00(userSession);
        boolean A1Z = DbW.A1Z(oJz);
        C51974G9v.A1N(r9, nkI, oky);
        C51972G9s.A1F(reboundHorizontalScrollView, A002);
        this.A06 = context;
        this.A08 = userSession;
        this.A0D = oJz;
        this.A07 = view;
        this.A0A = r9;
        this.A0C = oky;
        this.A0G = list;
        this.A0F = list2;
        this.A09 = reboundHorizontalScrollView;
        this.A0B = A002;
        0sn r4 = 0sn.A00;
        this.A04 = r4;
        this.A0H = 0sr.A1M(new C69378NkI[]{C69378NkI.FILTER});
        this.A0E = 0sr.A1M(new C69378NkI[]{C69378NkI.AVATAR_BACKGROUND});
        this.A0K = DbS.A0y();
        this.A03 = AnonymousClass05K.A00;
        this.A02 = nkI;
        ArrayList A0S = 00k.A0S(this.A0E, 00k.A0S(this.A0F, 00k.A0S(this.A0H, this.A0G)));
        this.A04 = A0S;
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            this.A0J.put(it.next(), r4);
        }
        A04(this);
        this.A09.A0A(new C72238Oz6(this));
        this.A09.setHorizontalFadingEdgeEnabled(A1Z);
        this.A09.setFadingEdgeLength(DbS.A03(this.A06.getResources(), R.dimen.abc_list_item_height_material));
    }

    public static final void A03(C71139Odj odj) {
        Rect A0W = AnonymousClass7TE.A0W();
        ReboundHorizontalScrollView reboundHorizontalScrollView = odj.A09;
        reboundHorizontalScrollView.getGlobalVisibleRect(A0W);
        int size = A02(odj).size();
        int i = 0;
        while (i < size) {
            View childAt = reboundHorizontalScrollView.getChildAt(i);
            if (childAt != null) {
                Rect A0W2 = AnonymousClass7TE.A0W();
                childAt.getGlobalVisibleRect(A0W2);
                if (Math.max(A0W.left, A0W2.left) < Math.min(A0W.right, A0W2.right)) {
                    C69350Njp A002 = ((C69378NkI) A02(odj).get(i)).A00(odj.A05);
                    Set set = odj.A0K;
                    if (!set.contains(A002)) {
                        odj.A0C.A00(new C72781PJv(A002));
                        set.add(A002);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }
}
