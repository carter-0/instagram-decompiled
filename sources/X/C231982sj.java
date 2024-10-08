package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2sj  reason: invalid class name and case insensitive filesystem */
public final class C231982sj extends C231632rz {
    public 2c5 A00;
    public final UserSession A01;
    public final C231992sk A02;
    public final 2bv A03;
    public final C231912sc A04;
    public final Map A05;
    public final Map A06;

    public final String getBinderGroupName() {
        return "FeedQuickPromotion";
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        String str = ((AnonymousClass4UC) obj).A0C;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final int getViewTypeCount() {
        return 4;
    }

    public C231982sj(UserSession userSession, 2bv r6, C231912sc r7, Map map) {
        C231992sk r0 = new C231992sk();
        this.A01 = userSession;
        this.A03 = r6;
        this.A04 = r7;
        this.A02 = r0;
        this.A05 = map;
        HashMap hashMap = new HashMap();
        this.A06 = hashMap;
        this.A00 = (2c5) 2c5.A03.getValue();
        hashMap.put("condensed_megaphone", 1);
        hashMap.put("social_context_condensed_megaphone_ig", 1);
        hashMap.put("standard_megaphone_ig", 0);
        hashMap.put("social_context_standard_megaphone_ig", 0);
        hashMap.put("inline_editing_standard_megaphone_ig", 2);
        hashMap.put("standard_bloks_megaphone_ig", 3);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        String str;
        int i;
        AnonymousClass4UE r4 = (AnonymousClass4UE) obj;
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        AnonymousClass4UC r42 = (AnonymousClass4UC) r4;
        if (r42.A08.A00() != null) {
            str = "standard_bloks_megaphone_ig";
        } else {
            str = r42.A09.A00;
        }
        Number number = (Number) this.A06.get(str);
        if (number != null) {
            i = number.intValue();
        } else {
            i = 0;
        }
        r3.A7U(i);
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C249703kE r3;
        int A032 = AnonymousClass0fD.A03(-147523636);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj, 2);
        AnonymousClass4UC r14 = (AnonymousClass4UC) obj;
        int A033 = AnonymousClass0fD.A03(-20171780);
        Object tag = view.getTag();
        if (tag instanceof C249703kE) {
            r3 = (C249703kE) tag;
        } else {
            r3 = null;
        }
        Context context = view.getContext();
        0qQ.A07(context);
        2c5 r5 = this.A00;
        Set CA0 = r14.CA0();
        String valueOf = String.valueOf(QuickPromotionSurface.A0C.A00);
        UserSession userSession = this.A01;
        AnonymousClass0eM r0 = 2c5.A03;
        AnonymousClass426 A002 = r5.A00(context, userSession, (2cX) null, valueOf, CA0);
        C231992sk r02 = this.A02;
        AnonymousClass2bO.A00();
        0qQ.A0B(userSession, 0);
        DcY.A00(userSession);
        if (FEW.A00(r02.A01.A00(new AnonymousClass4VQ(r14), A002)).A02) {
            view.setVisibility(0);
            C231912sc r03 = this.A04;
            Object obj3 = r03.A00.get(i, r03.A01);
            0qQ.A07(obj3);
            C231932se r52 = (C231932se) obj3;
            0qQ.A0C(r52, "null cannot be cast to non-null type com.instagram.quickpromotion.ui.megaphone.MegaphoneViewBinder<androidx.recyclerview.widget.RecyclerView.ViewHolder>");
            if (r3 != null) {
                Map map = this.A05;
                2bv r04 = this.A03;
                if (map != null) {
                    r52.ADr(r3, r04, r14, map);
                } else {
                    r52.ADo(r3, r04, r14);
                }
            }
        } else {
            view.setVisibility(8);
            if (r3 instanceof C254083ru) {
                C254083ru r32 = (C254083ru) r3;
                r32.A01.setVisibility(8);
                r32.A03.setVisibility(8);
                r32.A02.setVisibility(8);
            }
        }
        AnonymousClass0fD.A0A(510710182, A033);
        AnonymousClass0fD.A0A(-337618395, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(-1595238148);
        0qQ.A0B(viewGroup, 1);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C231912sc r0 = this.A04;
        Object obj = r0.A00.get(i, r0.A01);
        0qQ.A07(obj);
        0qQ.A0A(from);
        View CrT = ((C231932se) obj).CrT(from, viewGroup);
        AnonymousClass0fD.A0A(-1123229947, A032);
        return CrT;
    }

    public C231982sj() {
    }
}
