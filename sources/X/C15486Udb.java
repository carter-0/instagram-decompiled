package X;

import android.content.Context;
import android.view.View;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Udb  reason: case insensitive filesystem */
public final class C15486Udb extends 2Ru implements AnonymousClass71P {
    public int A00;
    public String A01;
    public final C273674n0 A02;
    public final C20920X4l A03;
    public final AnonymousClass2s2 A04;
    public final AnonymousClass71R A05;
    public final C15497Udm A06;
    public final NLE A07;
    public final C20988X8e A08;
    public final AnonymousClass71T A09;
    public final C229122ms A0A;
    public final C231762sK A0B;
    public final List A0C;
    public final Map A0D = new HashMap();

    /* JADX WARNING: type inference failed for: r13v0, types: [X.2s0, X.2s2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.NLE] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.Udm, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15486Udb(Context context, UserSession userSession, AnonymousClass4DU r22, AnonymousClass32J r23, C20920X4l x4l, C20988X8e x8e, AnonymousClass32Q r26, C229122ms r27) {
        super(false);
        UserSession userSession2 = userSession;
        C20988X8e x8e2 = x8e;
        AnonymousClass32Q r10 = r26;
        C229122ms r1 = r27;
        C51974G9v.A0d(2, userSession2, r10, r1, x8e2);
        this.A0A = r1;
        this.A08 = x8e2;
        this.A03 = x4l;
        ? obj = new Object();
        Context context2 = context;
        obj.A03 = context2.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
        obj.A00 = 2Yu.A0H(context2, R.attr.igds_color_stroke);
        this.A04 = obj;
        C231762sK r14 = new C231762sK(context2);
        this.A0B = r14;
        AnonymousClass71T r15 = new AnonymousClass71T(context2);
        this.A09 = r15;
        AnonymousClass71R r5 = new AnonymousClass71R(r22, userSession2, (C267644bx) null, r23, r10, (String) null, (String) null);
        this.A05 = r5;
        ? obj2 = new Object();
        this.A07 = obj2;
        ? obj3 = new Object();
        this.A06 = obj3;
        this.A02 = new C273674n0((C324266yu) null, r10, AnonymousClass05K.A01);
        this.A0C = new ArrayList();
        init(new C231642s0[]{obj, r14, r15, r5, obj2, obj3});
    }

    public final AnonymousClass6u8 BQA(String str) {
        0qQ.A0B(str, 0);
        Integer A0l = 00y.A0l(str);
        if (A0l == null) {
            return new AnonymousClass6u8();
        }
        int intValue = A0l.intValue();
        Map map = this.A0D;
        Object obj = map.get(str);
        AnonymousClass6u8 r3 = obj;
        if (obj == null) {
            AnonymousClass6u8 r32 = new AnonymousClass6u8();
            Iterator it = this.A02.A0E(intValue).iterator();
            while (it.hasNext()) {
                1Xj A0t = C51966G9m.A0t(it);
                String id = A0t.getId();
                if (id != null) {
                    r32.A01(id, C243233Xy.A00(A0t));
                }
            }
            map.put(str, r32);
            r3 = r32;
        }
        return (AnonymousClass6u8) r3;
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1Q(this.A00);
    }

    public static void A00(AnonymousClass0eM r0) {
        ((C15486Udb) r0.getValue()).A01();
    }

    public final void A01() {
        clear();
        C273674n0 r3 = this.A02;
        r3.A06();
        if (!isEmpty()) {
            for (Object addModel : this.A0C) {
                addModel(addModel, C60340gF.A00, this.A07);
            }
            String str = this.A01;
            if (!(str == null || r3.A02() == 0)) {
                addModel((Object) null, (Object) null, this.A04);
                addModel(new C15081UNy((View.OnClickListener) null, (Integer) null, (Integer) null, 0mp.A06("%s_%s_%s:", new Object[]{str, null, null}), str, (String) null, (String) null), C60340gF.A00, this.A06);
            }
            int A022 = r3.A02();
            for (int i = 0; i < A022; i++) {
                int A023 = r3.A02();
                C3251571g A0E = r3.A0E(i);
                AnonymousClass6u8 BQA = BQA(String.valueOf(i));
                boolean z = true;
                if (this.A0A.CKB() || i != A023 - 1) {
                    z = false;
                }
                BQA.A00(i, z);
                addModel(A0E, BQA, this.A05);
            }
        } else {
            C20988X8e x8e = this.A08;
            addModel(x8e.Afm(), x8e.B0w(), this.A09);
        }
        C229122ms r1 = this.A0A;
        if (r1.CKB() || r1.CT5()) {
            addModel(r1, this.A0B);
        }
        notifyDataSetChangedSmart();
    }

    public final void A02(List list, List list2, String str) {
        AnonymousClass7TG.A1O(str, list2);
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C17840Vgt) it.next()).A00;
        }
        this.A00 = i + list2.size();
        List list3 = this.A0C;
        list3.clear();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C17840Vgt vgt = (C17840Vgt) it2.next();
            String str2 = vgt.A02;
            if (str2 != null) {
                list3.add(new N4Q((View.OnClickListener) new WBD(59, (Object) this, (Object) vgt), str2, vgt.A00));
            } else {
                0qQ.A0F(DialogModule.KEY_TITLE);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        this.A01 = str;
        C273674n0 r0 = this.A02;
        r0.A04();
        r0.A0A(list2);
        A01();
    }
}
