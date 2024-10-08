package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.Arrays;

/* renamed from: X.EAl  reason: case insensitive filesystem */
public final class C47625EAl extends C231632rz {
    public final Context A00;

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 3;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r5, Object obj, Object obj2) {
        int ordinal = ((C46568DhA) obj).ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            r5.A7U(0);
        } else if (ordinal == 3) {
            r5.A7U(1);
        } else if (ordinal == 4) {
            r5.A7U(2);
        }
    }

    public C47625EAl(Context context) {
        this.A00 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r1 != 4) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r5, android.view.View r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = this;
            r0 = 2087493766(0x7c6ca086, float:4.9145514E36)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.DhA r7 = (X.C46568DhA) r7
            r0 = 2131431953(0x7f0b1211, float:1.848565E38)
            android.view.View r2 = X.DbU.A0B(r6, r0)
            int r1 = r7.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x002e
            r0 = 1
            if (r1 == r0) goto L_0x0038
            r0 = 2
            if (r1 == r0) goto L_0x002a
            r0 = 3
            if (r1 == r0) goto L_0x002e
            r0 = 4
            if (r1 == r0) goto L_0x002e
        L_0x0023:
            r0 = 1310820842(0x4e2189ea, float:6.7754253E8)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x002a:
            r0 = 2131239859(0x7f0823b3, float:1.8096037E38)
            goto L_0x003b
        L_0x002e:
            android.content.Context r1 = r4.A00
            r0 = 2130970314(0x7f0406ca, float:1.7549335E38)
            int r0 = X.2Yu.A0H(r1, r0)
            goto L_0x003b
        L_0x0038:
            r0 = 2131239858(0x7f0823b2, float:1.8096035E38)
        L_0x003b:
            r2.setBackgroundResource(r0)
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47625EAl.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View view;
        int i2;
        int A03 = AnonymousClass0fD.A03(1737036464);
        if (i == 0) {
            view = LayoutInflater.from(this.A00).inflate(R.layout.row_divider, viewGroup, false);
            i2 = 279650156;
        } else if (i == 1 || i == 2) {
            view = LayoutInflater.from(this.A00).inflate(R.layout.row_divider_dynamic_margin, viewGroup, false);
            i2 = 1513718453;
        } else {
            IllegalArgumentException A0a = DbW.A0a("viewType does not exist: ", i);
            AnonymousClass0fD.A0A(1984022695, A03);
            throw A0a;
        }
        AnonymousClass0fD.A0A(i2, A03);
        return view;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return Arrays.hashCode(AnonymousClass7TF.A1b(i));
    }
}
