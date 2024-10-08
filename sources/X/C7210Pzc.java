package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Pzc  reason: case insensitive filesystem */
public final class C7210Pzc {
    public AnonymousClass2Fy A00 = AnonymousClass2Fx.A00;
    public AnonymousClass2G7 A01 = AnonymousClass2G7.A00;
    public 2G1 A02 = Gson.A0H;
    public 2G1 A03 = Gson.A0I;
    public 2G5 A04 = 2G5.A02;
    public boolean A05 = true;
    public boolean A06 = false;
    public boolean A07 = false;
    public final LinkedList A08 = Pxe.A1A();
    public final List A09 = AnonymousClass7TE.A1C();
    public final List A0A = AnonymousClass7TE.A1C();
    public final Map A0B = AnonymousClass7TE.A1E();

    public final Gson A00() {
        List list = this.A09;
        int size = list.size();
        List list2 = this.A0A;
        ArrayList A0v = DbS.A0v(size + list2.size() + 3);
        A0v.addAll(list);
        Collections.reverse(A0v);
        ArrayList A1D = AnonymousClass7TE.A1D(list2);
        Collections.reverse(A1D);
        A0v.addAll(A1D);
        2G1 r0 = Gson.A0I;
        2G5 r11 = this.A04;
        AnonymousClass2Fy r7 = this.A00;
        HashMap A19 = Pxe.A19(this.A0B);
        boolean z = this.A07;
        boolean z2 = this.A05;
        boolean z3 = this.A06;
        return new Gson(r7, this.A01, this.A03, this.A02, r11, new ArrayList(list), new ArrayList(list2), A0v, AnonymousClass7TE.A1D(this.A08), A19, z, z2, z3);
    }

    public final void A01(2G6 r2) {
        this.A09.add(r2);
    }

    public final void A02(Object obj, Type type) {
        if ((obj instanceof C13658TeP) || (obj instanceof C13657TeO)) {
            TypeToken typeToken = new TypeToken(type);
            this.A09.add(new PzZ(typeToken, (Class) null, obj, AnonymousClass7TF.A1W(typeToken.type, typeToken.rawType)));
        } else if (!(obj instanceof TypeAdapter)) {
            throw Pxe.A0g();
        }
        if (obj instanceof TypeAdapter) {
            this.A09.add(new C12739T4z((TypeAdapter) obj, new TypeToken(type)));
        }
    }
}
