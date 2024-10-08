package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.modules.appstate.AppStateModule;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class OZJ {
    public final Map A00;
    public final Set A01;
    public final WeakHashMap A02;
    public final 0sP A03;

    public OZJ(List list, Set set, 0sP r36) {
        this.A01 = set;
        this.A03 = r36;
        this.A02 = new WeakHashMap();
        ONL onl = new ONL("touchListener", new C74179PqL(this, 1));
        ONL onl2 = new ONL("clickListener", new C74179PqL(this, 2));
        ONL onl3 = new ONL("longClickListener", new C74179PqL(this, 3));
        ONL onl4 = new ONL("focusChangeListener", new C74179PqL(this, 4));
        ONL onl5 = new ONL("scrollChangeListener", new C74179PqL(this, 5));
        ONL onl6 = new ONL("layoutChangeListeners", new C74179PqL(this, 6));
        ONL onl7 = new ONL("attachStateChangeListeners", new C74179PqL(this, 7));
        ONL onl8 = new ONL("dragListener", new C74179PqL(this, 8));
        ONL onl9 = new ONL("keyListener", new C74179PqL(this, 9));
        ONL onl10 = new ONL("contextClickListener", new TY5(this, 48));
        ONL onl11 = new ONL("applyWindowInsetsListener", new TY5(this, 49));
        ONL onl12 = new ONL(AppStateModule.APP_STATE_BACKGROUND, C73990PnH.A00);
        ONL onl13 = onl10;
        ONL onl14 = onl11;
        ONL onl15 = onl12;
        ONL onl16 = onl7;
        ONL onl17 = onl8;
        ONL onl18 = onl9;
        ONL onl19 = onl4;
        ONL onl20 = onl5;
        ONL onl21 = onl6;
        ONL onl22 = onl2;
        ONL onl23 = onl3;
        List list2 = list;
        LinkedHashSet A002 = 094.A00(list2, 0sc.A07(new ONL[]{onl, onl22, onl23, onl19, onl20, onl21, onl16, onl17, onl18, onl13, onl14, onl15, new ONL("foreground", C73991PnI.A00), new ONL("tag", C73992PnJ.A00), new ONL("seekBarListener", new C74179PqL(this, 0))}));
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(0Yv.A1E(A002, 10)));
        for (Object next : A002) {
            A0x.put(((ONL) next).A00, next);
        }
        this.A00 = A0x;
    }

    public final void A01(View view) {
        0qQ.A0B(view, 0);
        WeakHashMap weakHashMap = this.A02;
        Collection<ONL> values = this.A00.values();
        ArrayList A0r = AnonymousClass7TG.A0r(values);
        for (ONL onl : values) {
            A0r.add(new ONM(onl.A00, onl.A01.invoke(view)));
        }
        weakHashMap.put(view, 00k.A0k(A0r));
        if (view instanceof ViewGroup) {
            0kx r1 = new 0kx((ViewGroup) view);
            while (r1.hasNext()) {
                A01((View) r1.next());
            }
        }
    }

    public static final Object A00(View view, String str) {
        Object obj;
        try {
            Field declaredField = View.class.getDeclaredField("mListenerInfo");
            declaredField.setAccessible(true);
            obj = declaredField.get(view);
        } catch (Exception unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        try {
            Field declaredField2 = obj.getClass().getDeclaredField(str);
            declaredField2.setAccessible(true);
            return declaredField2.get(obj);
        } catch (Exception unused2) {
            return null;
        }
    }

    public OZJ() {
        this(0sn.A00, 0sl.A00, (0sP) null);
    }
}
