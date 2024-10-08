package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2t9  reason: invalid class name */
public final class AnonymousClass2t9 extends 2Rw {
    public static final C232202tA A0D = new Object();
    public boolean A00 = true;
    public View.OnLongClickListener A01;
    public C232312tT A02;
    public final C232252tJ A03;
    public final AnonymousClass2tH A04;
    public final Object A05;
    public final boolean A06;
    public final LayoutInflater A07;
    public final C231452rh A08;
    public final AnonymousClass2tN A09;
    public final C232292tQ A0A;
    public final C232302tS A0B;
    public final AnonymousClass2tR A0C;

    public final int A01(Class cls) {
        Object obj = this.A03.A02.get(cls);
        17k.A08(obj, cls.getName(), "No definition corresponding to model class %s was found");
        return ((Number) obj).intValue();
    }

    public final int A02(Object obj) {
        List Au8 = this.A04.Au8();
        for (int i = 0; i < Au8.size(); i++) {
            if (((C232262tL) Au8.get(i)).getKey().equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    @Deprecated
    public final Object A04(int i) {
        return this.A04.Au8().get(i);
    }

    public final void A05(ViewModelListUpdate viewModelListUpdate) {
        A06(viewModelListUpdate, A0D);
    }

    public final void A06(ViewModelListUpdate viewModelListUpdate, AnonymousClass2tB r9) {
        if (this.A06) {
            List<C232262tL> A0a = 00k.A0a(viewModelListUpdate.A00);
            HashMap hashMap = new HashMap(A0a.size());
            int i = 0;
            for (C232262tL r0 : A0a) {
                Class<?> cls = r0.getClass();
                Long valueOf = Long.valueOf(A03(cls, r0.getKey()));
                if (!hashMap.containsKey(valueOf)) {
                    hashMap.put(valueOf, Integer.valueOf(i));
                    i++;
                } else {
                    int intValue = ((Number) hashMap.get(valueOf)).intValue();
                    String simpleName = cls.getSimpleName();
                    StringBuilder sb = new StringBuilder();
                    sb.append(C66579MXk.A00(613));
                    sb.append(simpleName);
                    sb.append(AnonymousClass000.A00(1981));
                    sb.append(hashMap.get(valueOf));
                    sb.append(" and ");
                    sb.append(i);
                    throw new C73546Ped(this, simpleName, sb.toString(), intValue);
                }
            }
        }
        this.A04.Eyp(viewModelListUpdate, r9);
    }

    public final void A07(AnonymousClass2tB r5, C232262tL r6, int i) {
        int i2;
        C232262tL r0;
        ArrayList arrayList = new ArrayList(this.A04.Au8());
        if (i >= arrayList.size() || (r0 = (C232262tL) arrayList.get(i)) == null || !r0.getKey().equals(r6.getKey())) {
            i2 = 0;
            while (true) {
                if (i2 < arrayList.size()) {
                    if (((C232262tL) arrayList.get(i2)).getKey().equals(r6.getKey())) {
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        } else {
            i2 = i;
        }
        if (i2 >= 0 && i2 < arrayList.size()) {
            arrayList.set(i2, r6);
            ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
            viewModelListUpdate.A01(arrayList);
            A06(viewModelListUpdate, r5);
            return;
        }
        0KC.A0Q("IgRecyclerViewAdapter", "setModel with invalid index %d, size: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(arrayList.size())});
    }

    public final void A08(List list) {
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        viewModelListUpdate.A01(list);
        A05(viewModelListUpdate);
    }

    public final boolean A09(int i, Class... clsArr) {
        Object obj = this.A04.Au8().get(i);
        for (Class isInstance : clsArr) {
            if (isInstance.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void onBindViewHolder(C249703kE r23, int i) {
        C249703kE r6 = r23;
        int Ewi = AnonymousClass2Ro.A00.Ewi(r6.mItemViewType);
        int i2 = i;
        C232262tL r4 = (C232262tL) this.A04.Au8().get(i2);
        C232252tJ r0 = this.A03;
        Class<?> cls = r4.getClass();
        C232232tF r3 = (C232232tF) r0.A01.get(cls);
        17k.A08(r3, cls.getName(), "No definition corresponding to model %s was found");
        try {
            r3.bind(r4, r6);
            C232292tQ r1 = this.A0A;
            if (r1 != null) {
                r1.DYE(i2, getItemCount());
            }
            AnonymousClass2tR r12 = this.A0C;
            if (r12 != null) {
                View view = r6.itemView;
                0qQ.A0B(view, 0);
                if (r4 instanceof C296965qw) {
                    C55805Hnl hnl = r12.A00;
                    1Xj BPf = ((C296965qw) r4).BPf();
                    0qQ.A0B(BPf, 1);
                    String id = BPf.getId();
                    if (id != null) {
                        UserSession userSession = hnl.A00;
                        String A2v = BPf.A2v();
                        if (A2v == null) {
                            A2v = BPf.C9L();
                        }
                        C55805Hnl hnl2 = hnl;
                        hnl.A02.A00((C55513Hiv) null, new C57524IcC(hnl2, BPf, C231122qu.A07(userSession, BPf), A2v, i2), new GAN(view, hnl.A03, "explore", hnl.A01.getModuleName(), id));
                        hnl.A04.put(Integer.valueOf(view.hashCode()), id);
                    }
                }
            }
            View.OnLongClickListener onLongClickListener = this.A01;
            if (onLongClickListener != null) {
                r6.itemView.setOnLongClickListener(onLongClickListener);
            }
            r6.itemView.setHapticFeedbackEnabled(this.A00);
            AnonymousClass0mX.A00.A01(r6.itemView, getItemCount(), i2);
            String name = r3.getClass().getName();
            0qQ.A0B(name, 0);
            AnonymousClass2Ro.A00.ASI(C320866t5.A00(r3, r4, name, false, false), Ewi);
        } catch (Exception e) {
            throw e;
        }
    }

    public final void onViewAttachedToWindow(C249703kE r2) {
        C232302tS r0 = this.A0B;
        if (r0 != null) {
            r0.Dyk(r2);
        }
    }

    public final void onViewRecycled(C249703kE r5) {
        this.A03.A01(r5.mItemViewType).unbind(r5);
        AnonymousClass2tR r1 = this.A0C;
        if (r1 != null) {
            View view = r5.itemView;
            0qQ.A0B(view, 0);
            C55805Hnl hnl = r1.A00;
            String str = (String) hnl.A04.remove(Integer.valueOf(view.hashCode()));
            if (str != null) {
                hnl.A02.A01(str, view);
            }
        }
    }

    public AnonymousClass2t9(LayoutInflater layoutInflater, View.OnLongClickListener onLongClickListener, AnonymousClass4AI r5, C232292tQ r6, C232302tS r7, C232252tJ r8, C232312tT r9, AnonymousClass2tH r10, AnonymousClass2tR r11, Object obj, boolean z) {
        C231452rh AMK;
        this.A07 = layoutInflater;
        this.A03 = r8;
        this.A06 = z;
        this.A09 = new AnonymousClass2tN();
        this.A04 = r10;
        if (r5 == null) {
            AMK = new AnonymousClass2tP(this);
        } else {
            AMK = r5.AMK(this);
        }
        this.A08 = AMK;
        r10.EcF(AMK);
        this.A0A = r6;
        this.A0C = r11;
        this.A0B = r7;
        this.A01 = onLongClickListener;
        this.A02 = r9;
        this.A05 = obj;
        setHasStableIds(true);
    }

    public static AnonymousClass2tC A00(Context context) {
        return new AnonymousClass2tC(LayoutInflater.from(context));
    }

    public final long A03(Class cls, Object obj) {
        int A032 = AnonymousClass0fD.A03(-1201403047);
        long A002 = this.A09.A00(cls, obj);
        AnonymousClass0fD.A0A(1656659835, A032);
        return A002;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1766437426);
        int size = this.A04.Au8().size();
        AnonymousClass0fD.A0A(24323517, A032);
        return size;
    }

    public final long getItemId(int i) {
        int A032 = AnonymousClass0fD.A03(708819069);
        C232262tL r0 = (C232262tL) this.A04.Au8().get(i);
        long A002 = this.A09.A00(r0.getClass(), r0.getKey());
        AnonymousClass0fD.A0A(458917737, A032);
        return A002;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(-1931069282);
        Object obj = this.A04.Au8().get(i);
        C232252tJ r0 = this.A03;
        Class<?> cls = obj.getClass();
        Object obj2 = r0.A02.get(cls);
        17k.A08(obj2, cls.getName(), "No definition corresponding to model class %s was found");
        int intValue = ((Number) obj2).intValue();
        AnonymousClass0fD.A0A(1500808839, A032);
        return intValue;
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C249703kE createViewHolder;
        C320896t8 A002;
        AnonymousClass0mX.A00(viewGroup);
        int Ewo = AnonymousClass2Ro.A00.Ewo(i);
        C232312tT r0 = this.A02;
        if (r0 == null || (createViewHolder = r0.AX2(i)) == null) {
            C232232tF A012 = this.A03.A01(i);
            createViewHolder = A012.createViewHolder(viewGroup, this.A07);
            String name = A012.getClass().getName();
            0qQ.A0B(name, 0);
            A002 = C320866t5.A00(A012, (Object) null, name, false, false);
        } else {
            String name2 = createViewHolder.getClass().getName();
            0qQ.A0B(name2, 0);
            A002 = C320866t5.A00(createViewHolder, (Object) null, name2, false, false);
        }
        AnonymousClass2Ro.A00.ASL(A002, Ewo);
        return createViewHolder;
    }
}
