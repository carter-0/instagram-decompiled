package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.AbstractCollection;

/* renamed from: X.MWw  reason: case insensitive filesystem */
public interface C66568MWw {
    C59974Jcj AWf(Context context, Drawable drawable, C62592KiP kiP);

    C66534MVo ArI();

    int BEU();

    String getName();

    static int A00(C60070Jez jez) {
        C66568MWw mWw = jez.A01;
        0qQ.A07(mWw);
        return mWw.BEU();
    }

    static C66534MVo A01(C60070Jez jez) {
        C66568MWw mWw = jez.A01;
        0qQ.A07(mWw);
        return mWw.ArI();
    }

    static void A03(C66437MRr mRr, C60070Jez jez, AbstractCollection abstractCollection) {
        C66568MWw mWw = jez.A01;
        0qQ.A07(mWw);
        abstractCollection.add(new C63695L3f(mRr, mWw.BEU()));
    }

    static String A02(C60060Jeb jeb) {
        jeb.getClass();
        C66568MWw mWw = jeb.A05.A01;
        0qQ.A07(mWw);
        return mWw.getName();
    }
}
