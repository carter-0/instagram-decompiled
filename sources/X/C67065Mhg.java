package X;

import android.content.Context;
import android.text.Editable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.Mhg  reason: case insensitive filesystem */
public final class C67065Mhg {
    public Set A00;
    public final C67071Mhm A01;
    public final C67071Mhm A02;
    public final C67071Mhm A03;
    public final C67071Mhm A04;
    public final C67071Mhm A05;
    public final C67071Mhm A06;
    public final C67071Mhm A07;
    public final C67071Mhm A08;
    public final C67070Mhl A09;
    public final Integer A0A;
    public final List A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final List A0G;

    public C67065Mhg(Context context, Integer num, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        String str;
        String str2;
        String str3;
        C67071Mhm mhm;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        C67071Mhm mhm2;
        C67071Mhm mhm3;
        this.A0A = num;
        Integer num2 = AnonymousClass05K.A00;
        if (z6) {
            str = "(?<=[\\s_~'\"(]|^)(\\*\\*)(\\S(?:.*?\\S)??)(\\*\\*)(?=[\\s_~,.;:!?'\")]|$)";
        } else {
            str = "(?<=[\\s_~'\"(]|^)(\\*)(\\S(?:.*?\\S)??)(\\*)(?=[\\s_~,.;:!?'\")]|$)";
        }
        Pattern compile = Pattern.compile(str);
        0qQ.A07(compile);
        C67463MoI moI = C67463MoI.A00;
        C74230PrJ prJ = C67071Mhm.A06;
        this.A01 = new C67071Mhm(prJ, moI, num2, compile, true, true);
        Integer num3 = AnonymousClass05K.A01;
        Pattern compile2 = Pattern.compile("(^\\s*[*-]\\s.*$)", 8);
        0qQ.A07(compile2);
        Context context2 = context;
        int i7 = i;
        this.A02 = new C67071Mhm(new C67280MlF(1), new C67281MlG(context2, i7, 0), num3, compile2, true, false);
        Integer num4 = AnonymousClass05K.A0C;
        Pattern compile3 = Pattern.compile("(^([1-9][0-9]?)\\.\\s.*$)", 8);
        0qQ.A07(compile3);
        this.A06 = new C67071Mhm(new C67280MlF(4), new C67281MlG(context2, i7, 1), num4, compile3, true, false);
        Integer num5 = AnonymousClass05K.A0N;
        if (z6) {
            str2 = "(?<=[\\s*~'\"(]|^)(\\*)(\\S(?:.*?\\S)??)(\\*)(?=[\\s*~,.;:!?'\")]|$)";
        } else {
            str2 = "(?<=[\\s*~'\"(]|^)(_)(\\S(?:.*?\\S)??)(_)(?=[\\s*~,.;:!?'\")]|$)";
        }
        Pattern compile4 = Pattern.compile(str2);
        0qQ.A07(compile4);
        this.A03 = new C67071Mhm(prJ, C67464MoJ.A00, num5, compile4, true, true);
        Integer num6 = AnonymousClass05K.A0Y;
        if (z6) {
            str3 = "(?<=[\\s*_'\"(]|^)(~~)(\\S(?:.*?\\S)??)(~~)(?=[\\s*_,.;:!?'\")]|$)";
        } else {
            str3 = "(?<=[\\s*_'\"(]|^)(~)(\\S(?:.*?\\S)??)(~)(?=[\\s*_,.;:!?'\")]|$)";
        }
        Pattern compile5 = Pattern.compile(str3);
        0qQ.A07(compile5);
        this.A08 = new C67071Mhm(prJ, C67465MoK.A00, num6, compile5, true, true);
        Integer num7 = AnonymousClass05K.A0j;
        Pattern compile6 = Pattern.compile("(?<=[\\s*_'\"(]|^)(```)(\\S(?:.*?\\S)??)(```)(?=[\\s*_,.;:!?'\")]|$)");
        0qQ.A07(compile6);
        this.A05 = new C67071Mhm(prJ, C67466MoL.A00, num7, compile6, true, true);
        Integer num8 = AnonymousClass05K.A0u;
        Pattern compile7 = Pattern.compile("");
        0qQ.A07(compile7);
        this.A07 = new C67071Mhm(prJ, new C67069Mhk(i3), num8, compile7, true, true);
        0eO r5 = 0eO.A02;
        this.A0C = AnonymousClass0eN.A00(r5, new C67001MgZ(i4, 2));
        this.A0F = AnonymousClass0eN.A00(r5, C67067Mhi.A00);
        int i8 = i2;
        int i9 = i5;
        int i10 = i6;
        Context context3 = context2;
        this.A0D = AnonymousClass0eN.A00(r5, new C67068Mhj(context3, i8, i9, i10, 0));
        this.A0E = AnonymousClass0eN.A00(r5, new C67068Mhj(context3, i8, i9, i10, 1));
        Integer num9 = AnonymousClass05K.A03;
        Pattern compile8 = Pattern.compile("\\[([^]]+?)]\\(([^)]+)\\)");
        0qQ.A07(compile8);
        this.A04 = new C67071Mhm(new C67280MlF(2), new C67066Mhh(this), num9, compile8, true, false);
        C67071Mhm mhm4 = this.A01;
        C67071Mhm mhm5 = this.A03;
        C67071Mhm mhm6 = this.A08;
        C67071Mhm mhm7 = null;
        if (z4) {
            mhm = this.A05;
        } else {
            mhm = null;
        }
        if (z) {
            obj = this.A0F.getValue();
        } else {
            obj = null;
        }
        C67071Mhm mhm8 = (C67071Mhm) obj;
        if (z) {
            obj2 = this.A0C.getValue();
        } else {
            obj2 = null;
        }
        C67071Mhm mhm9 = (C67071Mhm) obj2;
        if (z2) {
            obj3 = this.A0E.getValue();
        } else {
            obj3 = null;
        }
        C67071Mhm mhm10 = (C67071Mhm) obj3;
        if (z2) {
            obj4 = this.A0D.getValue();
        } else {
            obj4 = null;
        }
        C67071Mhm[] mhmArr = {mhm4, mhm5, mhm6, mhm, mhm8, mhm9, mhm10, (C67071Mhm) obj4, z5 ? this.A04 : mhm7};
        0qQ.A0B(mhmArr, 0);
        this.A0B = 03t.A0I(mhmArr);
        if (z3) {
            mhm2 = this.A02;
        } else {
            mhm2 = null;
        }
        if (z3) {
            mhm3 = this.A06;
        } else {
            mhm3 = null;
        }
        C67071Mhm[] mhmArr2 = {mhm2, mhm3, null};
        0qQ.A0B(mhmArr2, 0);
        this.A0G = 03t.A0I(mhmArr2);
        this.A09 = new C67070Mhl();
    }

    public final Editable A00(CharSequence charSequence) {
        int i;
        0qQ.A0B(charSequence, 0);
        Editable newEditable = Editable.Factory.getInstance().newEditable(charSequence);
        C67070Mhl mhl = this.A09;
        0qQ.A0A(newEditable);
        ArrayList A012 = mhl.A01(newEditable, this.A0B);
        ArrayList arrayList = new ArrayList();
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            for (Object add : ((C67601MqZ) it.next()).A03) {
                arrayList.add(add);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(Integer.valueOf(((C67600MqY) next).A01))) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (hashSet2.add(Integer.valueOf(((C67600MqY) next2).A00))) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList(arrayList4);
        01V.A1D(arrayList5, 29b.A01());
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            C67600MqY mqY = (C67600MqY) it4.next();
            int i2 = mqY.A01;
            if (i2 >= 0 && i2 < (i = mqY.A00) && i <= newEditable.length()) {
                newEditable.delete(i2, i);
            }
        }
        return newEditable;
    }

    public final void A01(Editable editable, boolean z) {
        0qQ.A0B(editable, 0);
        ArrayList A022 = this.A09.A02(editable, 00k.A0S(this.A0G, this.A0B), z);
        Comparator reverseOrder = Collections.reverseOrder();
        0qQ.A07(reverseOrder);
        for (C67600MqY mqY : 00k.A0g(A022, reverseOrder)) {
            int i = mqY.A00;
            if (i <= editable.length()) {
                editable.delete(mqY.A01, i);
            }
        }
        int length = editable.length();
        int i2 = 0;
        while (i2 < length && Character.isWhitespace(editable.charAt(i2))) {
            i2++;
        }
        int i3 = length;
        while (i3 > i2 && Character.isWhitespace(editable.charAt(i3 - 1))) {
            i3--;
        }
        if (i3 < length) {
            editable.delete(i3, length);
        }
        if (i2 > 0) {
            editable.delete(0, i2);
        }
    }
}
