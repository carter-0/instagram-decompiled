package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.4AG  reason: invalid class name */
public final class AnonymousClass4AG extends C249703kE {
    public final RecyclerView A00;
    public final UserSession A01;
    public final C67333Mm9 A02;
    public final C229402nK A03;
    public final AnonymousClass2t9 A04;
    public final NotesRepository A05;
    public final AnonymousClass4AX A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4AG(android.view.LayoutInflater r26, android.view.View r27, X.AnonymousClass4DH r28, X.AnonymousClass0iw r29, com.instagram.common.session.UserSession r30, X.2el r31, X.C67333Mm9 r32, X.C2614849t r33) {
        /*
            r25 = this;
            r0 = 1
            r8 = r30
            X.0qQ.A0B(r8, r0)
            r13 = 2
            r9 = r29
            X.0qQ.A0B(r9, r13)
            r0 = 3
            r15 = r28
            X.0qQ.A0B(r15, r0)
            r0 = 4
            r7 = r31
            X.0qQ.A0B(r7, r0)
            r0 = 5
            r6 = r33
            X.0qQ.A0B(r6, r0)
            r11 = r25
            r10 = r27
            r11.<init>(r10)
            r11.A01 = r8
            r0 = r32
            r11.A02 = r0
            com.instagram.direct.inbox.notes.NotesRepository r14 = X.AnonymousClass43C.A00(r8)
            r11.A05 = r14
            r0 = 2131429765(0x7f0b0985, float:1.8481212E38)
            android.view.View r5 = r10.requireViewById(r0)
            X.0qQ.A07(r5)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            r11.A00 = r5
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            androidx.fragment.app.FragmentActivity r3 = r15.requireActivity()
            java.lang.String r0 = "inbox_hub"
            X.0xG r2 = new X.0xG
            r2.<init>(r0)
            r1 = 23607484(0x16838bc, float:4.2652375E-38)
            X.2nK r0 = new X.2nK
            r0.<init>(r3, r2, r8, r1)
            r11.A03 = r0
            androidx.fragment.app.FragmentActivity r4 = r15.requireActivity()
            X.0qQ.A0B(r5, r13)
            X.4AH r3 = new X.4AH
            r3.<init>(r5)
            X.2tC r2 = new X.2tC
            r0 = r26
            r2.<init>(r0)
            X.4AF r12 = r6.AmV()
            r1 = 0
            X.0qQ.A0B(r12, r13)
            boolean r20 = X.AnonymousClass4AJ.A0G(r8)
            X.4AK r0 = new X.4AK
            r17 = r9
            r18 = r8
            r19 = r12
            r21 = r1
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            r2.A01(r0)
            boolean r23 = X.AnonymousClass4AJ.A0G(r8)
            X.07V r17 = r6.getLifecycle()
            r0 = 15
            X.Pm4 r13 = new X.Pm4
            r13.<init>(r6, r0)
            X.4AL r0 = new X.4AL
            r22 = r13
            r24 = r1
            r20 = r7
            r21 = r12
            r18 = r9
            r19 = r8
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r2.A01(r0)
            X.AnonymousClass4AJ.A0G(r8)
            X.4AO r0 = new X.4AO
            r0.<init>(r9, r8, r7, r12)
            r2.A01(r0)
            X.AnonymousClass4AJ.A0G(r8)
            X.4AD r21 = r6.BWa()
            X.4AP r0 = new X.4AP
            r16 = r0
            r17 = r4
            r16.<init>(r17, r18, r19, r20, r21)
            r2.A01(r0)
            com.instagram.direct.inbox.notes.NotesRepository r12 = X.AnonymousClass43C.A00(r8)
            X.4AQ r0 = new X.4AQ
            r0.<init>(r8, r12)
            r2.A01(r0)
            X.4AR r0 = new X.4AR
            r0.<init>(r4, r9, r8)
            r2.A01(r0)
            r2.A01 = r3
            X.2t9 r4 = r2.A00()
            r11.A04 = r4
            X.4AX r0 = new X.4AX
            r0.<init>(r6, r11)
            r11.A06 = r0
            android.content.Context r3 = r10.getContext()
            X.0qQ.A07(r3)
            boolean r0 = X.AnonymousClass4AJ.A0G(r8)
            if (r0 == 0) goto L_0x0133
            r2 = 3
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            r0.<init>(r3, r2)
        L_0x0100:
            r5.setLayoutManager(r0)
            r5.setAdapter(r4)
            X.2eX r2 = new X.2eX
            r2.<init>(r10)
            X.2eo[] r0 = new X.AnonymousClass2eo[r1]
            r7.A08(r5, r2, r0)
            X.0h9 r1 = r15.mLifecycleRegistry
            X.4JO r0 = new X.4JO
            r0.<init>(r11)
            r1.A09(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322555602151668(0x810b2c000028f4, double:3.0338686497679897E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 != 0) goto L_0x012a
            r14.A0B()
        L_0x012a:
            X.4AE r0 = new X.4AE
            r0.<init>(r11)
            r6.EjK(r0)
            return
        L_0x0133:
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r3)
            r0.A1o(r1)
            goto L_0x0100
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4AG.<init>(android.view.LayoutInflater, android.view.View, X.4DH, X.0iw, com.instagram.common.session.UserSession, X.2el, X.Mm9, X.49t):void");
    }

    /* JADX WARNING: type inference failed for: r0v36, types: [X.2tL, java.lang.Object] */
    public final void A00(C66980MgE mgE) {
        int i;
        int i2;
        Integer num;
        int intValue;
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        AnonymousClass4AS r8 = mgE.A01;
        if (r8 != null) {
            viewModelListUpdate.A00(r8);
        }
        List<AnonymousClass4AB> list = mgE.A03;
        for (AnonymousClass4AB r7 : list) {
            C60340gF r9 = C60340gF.A00;
            String A0g = 002.A0g(r7.A0A.getId(), r7.A0G, r7.A0F);
            AnonymousClass30Y r0 = AnonymousClass30Y.A07;
            C2354830a r6 = new C2354830a(r7, r9, A0g);
            r6.A00(new C66968Mg1(this.A01, this.A06));
            r7.A00 = r6;
        }
        Integer num2 = mgE.A02;
        if (num2 == null || (intValue = num2.intValue()) == -1) {
            viewModelListUpdate.A01(list);
        } else {
            int size = list.size();
            viewModelListUpdate.A01(list.subList(0, intValue));
            viewModelListUpdate.A00(new Object());
            int i3 = size - 1;
            viewModelListUpdate.A01(list.subList(intValue, i3));
            C252553pI r1 = this.A00.A0D;
            if (r1 != null) {
                int i4 = intValue + 3;
                if (r8 != null) {
                    i4 = intValue + 4;
                }
                if (i4 > i3) {
                    i4 = i3;
                }
                r1.A1O(i4);
            }
        }
        if (AnonymousClass4AJ.A03(this.A01)) {
            List list2 = viewModelListUpdate.A00;
            List<Object> A0a = 00k.A0a(list2);
            if (!(A0a instanceof Collection) || !A0a.isEmpty()) {
                i = 0;
                for (Object obj : A0a) {
                    if ((!(obj instanceof AnonymousClass4AB)) && (i = i + 1) < 0) {
                        0sr.A1S();
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            } else {
                i = 0;
            }
            List<AnonymousClass4AT> list3 = mgE.A04;
            if (list3 != null) {
                ArrayList arrayList = new ArrayList(0Yv.A1E(list3, 10));
                for (AnonymousClass4AT r82 : list3) {
                    C60340gF r10 = C60340gF.A00;
                    String A0i = 002.A0i("MediaNoteStack-", r82.A0B, r82.A06.getId(), '-');
                    AnonymousClass30Y r02 = AnonymousClass30Y.A07;
                    C2354830a r72 = new C2354830a(r82, r10, A0i);
                    r72.A00(new C52499GVb(new AnonymousClass9LZ(this, 22)));
                    r82.A00 = r72.A01();
                    int i5 = r82.A01 + i;
                    if (i5 <= 0 || i5 >= list2.size()) {
                        list2.add(r82);
                    } else {
                        list2.add(i5, r82);
                    }
                    arrayList.add(viewModelListUpdate);
                }
            }
            AnonymousClass4A9 r73 = mgE.A00;
            if (r73 != null && r73.A07) {
                AnonymousClass4AB r03 = (AnonymousClass4AB) 00k.A0J(list);
                if (r03 == null || (num = r03.A01) == null) {
                    i2 = 0;
                } else {
                    i2 = num.intValue();
                }
                r73.A01 = (long) i2;
                r73.A00 = 0;
                C60340gF r3 = C60340gF.A00;
                AnonymousClass30Y r04 = AnonymousClass30Y.A07;
                C2354830a r2 = new C2354830a(r73, r3, "FriendMapEntryPoint");
                r2.A00(new C52498GVa(new C377089Km(this, 30)));
                r73.A02 = r2.A01();
                if (1 < list2.size()) {
                    list2.add(1, r73);
                } else {
                    list2.add(r73);
                }
            }
        }
        this.A04.A05(viewModelListUpdate);
    }
}
