package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.api.schemas.DemarcatorActionType;
import com.instagram.api.schemas.DemarcatorStyleEnum;

/* renamed from: X.2td  reason: invalid class name and case insensitive filesystem */
public final class C232392td extends C231632rz {
    public C229782oC A00;

    public final String getBinderGroupName() {
        return "EndOfFeedUnitDemarcator";
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        String str = ((1sU) obj).A04.A0B;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final int getViewTypeCount() {
        return 6;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        AnonymousClass4ZJ r3;
        AnonymousClass4ZJ r0;
        String str;
        Integer num;
        String str2;
        View.OnClickListener iaq;
        View.OnClickListener iaq2;
        String str3;
        String str4;
        Object obj3 = obj2;
        Object obj4 = obj;
        int A03 = AnonymousClass0fD.A03(-1804632387);
        View view2 = view;
        0qQ.A0B(view2, 1);
        0qQ.A0B(obj4, 2);
        0qQ.A0B(obj3, 3);
        if (view2.getTag() instanceof AnonymousClass52D) {
            Object tag = view2.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.mainfeed.unconnectedcontent.EndOfFeedUnitDemarcatorHolder");
            AnonymousClass52D r11 = (AnonymousClass52D) tag;
            1sU r13 = (1sU) obj4;
            AnonymousClass523 r12 = (AnonymousClass523) obj3;
            C229782oC r10 = this.A00;
            0qQ.A0B(r11, 0);
            0qQ.A0B(r13, 1);
            0qQ.A0B(r12, 2);
            DemarcatorStyleEnum demarcatorStyleEnum = DemarcatorStyleEnum.ON_TOP_V1;
            DemarcatorStyleEnum demarcatorStyleEnum2 = r13.A03;
            if (demarcatorStyleEnum == demarcatorStyleEnum2) {
                r12.A00();
            }
            r11.A01(r12);
            r11.A04(r13.A0C, r13.A0B);
            String str5 = "";
            View.OnClickListener onClickListener = null;
            r11.A02(str5, (View.OnClickListener) null);
            r11.A03(str5, (View.OnClickListener) null);
            DemarcatorActionType demarcatorActionType = r13.A01;
            DemarcatorActionType demarcatorActionType2 = r13.A02;
            AnonymousClass4ZI r15 = r13.A06;
            if (r15 != null) {
                r3 = r15.A00(C242603Vd.FAVORITES.A00);
                if (r3 == null) {
                    r3 = r15.A00(C242603Vd.OLDER_POSTS.A00);
                }
            } else {
                r3 = r13.A05;
            }
            if (r11 instanceof AnonymousClass52F) {
                num = AnonymousClass05K.A0C;
            } else if (r13.A07 == 1UQ.A0E) {
                num = AnonymousClass05K.A00;
            } else {
                String str6 = C242603Vd.FAVORITES.A00;
                if (r15 != null) {
                    r0 = r15.A00(str6);
                    if (r0 == null) {
                        r0 = r15.A00(C242603Vd.OLDER_POSTS.A00);
                    }
                } else {
                    r0 = r13.A05;
                }
                if (r0 != null) {
                    str = r0.A03;
                } else {
                    str = null;
                }
                if (0qQ.A0K(str6, str)) {
                    num = AnonymousClass05K.A0N;
                } else {
                    num = AnonymousClass05K.A01;
                }
            }
            r12.A02 = AnonymousClass52G.A00(num);
            if (r3 != null && (((str3 = r3.A04) != null && str3.length() != 0 && ((!r3.A06.isEmpty()) || ((str4 = r3.A00) != null && str4.length() != 0))) || demarcatorStyleEnum == demarcatorStyleEnum2)) {
                r11.A03(str3, new AnonymousClass52H(r13, r3, r12, r10, num));
            } else if (demarcatorActionType != null) {
                if (demarcatorActionType2 != null) {
                    str5 = r13.A09;
                }
                View.OnClickListener onClickListener2 = null;
                if (r10 != null) {
                    int ordinal = demarcatorActionType.ordinal();
                    if (ordinal == 1) {
                        iaq2 = new IAQ(r10);
                    } else if (ordinal == 2) {
                        iaq2 = new IAR(r10);
                    }
                    onClickListener2 = iaq2;
                }
                r11.A02(str5, onClickListener2);
                if (demarcatorActionType2 != null) {
                    str2 = r13.A0A;
                    demarcatorActionType = demarcatorActionType2;
                } else {
                    str2 = r13.A09;
                }
                if (r10 != null) {
                    int ordinal2 = demarcatorActionType.ordinal();
                    if (ordinal2 == 1) {
                        iaq = new IAQ(r10);
                    } else if (ordinal2 == 2) {
                        iaq = new IAR(r10);
                    }
                    onClickListener = iaq;
                }
                r11.A03(str2, onClickListener);
            }
            r11.A00(r13);
        }
        AnonymousClass0fD.A0A(-790506219, A03);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r4, Object obj, Object obj2) {
        int i;
        1sU r5 = (1sU) obj;
        AnonymousClass523 r6 = (AnonymousClass523) obj2;
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        0qQ.A0B(r6, 2);
        if (r6.getPosition() == 0 && r5.A07 == 1UQ.A0E) {
            i = 2;
        } else {
            DemarcatorStyleEnum demarcatorStyleEnum = DemarcatorStyleEnum.V4;
            DemarcatorStyleEnum demarcatorStyleEnum2 = r5.A03;
            if (demarcatorStyleEnum == demarcatorStyleEnum2) {
                i = 1;
            } else if (DemarcatorStyleEnum.HIDDEN == demarcatorStyleEnum2) {
                i = 3;
            } else if (DemarcatorStyleEnum.ON_TOP_V1 == demarcatorStyleEnum2) {
                i = 4;
            } else {
                i = 0;
                if (DemarcatorStyleEnum.DISCOVER_MORE_V1 == demarcatorStyleEnum2) {
                    i = 5;
                }
            }
        }
        r4.A7V(i, r5, r6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.Uo1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.52C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.Uo0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.Uo2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.52F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: X.52F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.52F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: X.52F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: X.52F} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View createView(int r18, android.view.ViewGroup r19) {
        /*
            r17 = this;
            r0 = 1801048863(0x6b59d31f, float:2.633339E26)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 1
            r5 = r19
            X.0qQ.A0B(r5, r1)
            android.content.Context r2 = r5.getContext()
            X.0qQ.A07(r2)
            r4 = 0
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.feed.ui.views.ProgressListener"
            r6 = r18
            if (r6 == r1) goto L_0x013f
            r1 = 2
            if (r6 == r1) goto L_0x00fb
            r1 = 3
            if (r6 == r1) goto L_0x00ed
            r1 = 4
            if (r6 == r1) goto L_0x00ac
            r1 = 5
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            if (r6 == r1) goto L_0x0087
            r1 = 2131626649(0x7f0e0a99, float:1.888054E38)
            android.view.View r12 = r2.inflate(r1, r5, r4)
            r1 = 2131431424(0x7f0b1000, float:1.8484577E38)
            android.view.View r9 = r12.requireViewById(r1)
            X.0qQ.A0C(r9, r3)
            X.529 r9 = (X.AnonymousClass529) r9
            r1 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.view.View r7 = r12.requireViewById(r1)
            X.0qQ.A07(r7)
            com.instagram.common.ui.base.IgTextView r7 = (com.instagram.common.ui.base.IgTextView) r7
            r1 = 2131442048(0x7f0b3980, float:1.8506125E38)
            android.view.View r8 = r12.requireViewById(r1)
            X.0qQ.A07(r8)
            com.instagram.common.ui.base.IgTextView r8 = (com.instagram.common.ui.base.IgTextView) r8
            r1 = 2131433087(0x7f0b167f, float:1.848795E38)
            android.view.View r6 = r12.requireViewById(r1)
            X.0qQ.A07(r6)
            r1 = 2131429285(0x7f0b07a5, float:1.8480238E38)
            android.view.View r10 = r12.requireViewById(r1)
            X.0qQ.A07(r10)
            com.instagram.igds.components.button.IgdsButton r10 = (com.instagram.igds.components.button.IgdsButton) r10
            r1 = 2131435466(0x7f0b1fca, float:1.8492775E38)
            android.view.View r11 = r12.requireViewById(r1)
            X.0qQ.A07(r11)
            com.instagram.igds.components.button.IgdsButton r11 = (com.instagram.igds.components.button.IgdsButton) r11
            X.Uo2 r5 = new X.Uo2
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x007d:
            r12.setTag(r5)
        L_0x0080:
            r1 = 1683598501(0x6459aca5, float:1.6061535E22)
            X.AnonymousClass0fD.A0A(r1, r0)
            return r12
        L_0x0087:
            r1 = 2131626648(0x7f0e0a98, float:1.8880538E38)
            android.view.View r12 = r2.inflate(r1, r5, r4)
            r1 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.view.View r2 = r12.requireViewById(r1)
            X.0qQ.A07(r2)
            com.instagram.common.ui.base.IgTextView r2 = (com.instagram.common.ui.base.IgTextView) r2
            r1 = 2131442048(0x7f0b3980, float:1.8506125E38)
            android.view.View r1 = r12.requireViewById(r1)
            X.0qQ.A07(r1)
            com.instagram.common.ui.base.IgTextView r1 = (com.instagram.common.ui.base.IgTextView) r1
            X.Uo0 r5 = new X.Uo0
            r5.<init>(r2, r1)
            goto L_0x007d
        L_0x00ac:
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1 = 2131626651(0x7f0e0a9b, float:1.8880544E38)
            android.view.View r12 = r2.inflate(r1, r5, r4)
            r1 = 2131431424(0x7f0b1000, float:1.8484577E38)
            android.view.View r4 = r12.requireViewById(r1)
            X.0qQ.A0C(r4, r3)
            X.529 r4 = (X.AnonymousClass529) r4
            r1 = 2131442048(0x7f0b3980, float:1.8506125E38)
            android.view.View r3 = r12.requireViewById(r1)
            X.0qQ.A07(r3)
            com.instagram.common.ui.base.IgTextView r3 = (com.instagram.common.ui.base.IgTextView) r3
            r1 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.view.View r2 = r12.requireViewById(r1)
            X.0qQ.A07(r2)
            com.instagram.common.ui.base.IgTextView r2 = (com.instagram.common.ui.base.IgTextView) r2
            r1 = 2131435466(0x7f0b1fca, float:1.8492775E38)
            android.view.View r1 = r12.requireViewById(r1)
            X.0qQ.A07(r1)
            com.instagram.igds.components.button.IgdsButton r1 = (com.instagram.igds.components.button.IgdsButton) r1
            X.52C r5 = new X.52C
            r5.<init>(r3, r2, r4, r1)
            goto L_0x007d
        L_0x00ed:
            android.view.View r12 = new android.view.View
            r12.<init>(r2)
            X.Unz r1 = new X.Unz
            r1.<init>()
            r12.setTag(r1)
            goto L_0x0080
        L_0x00fb:
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1 = 2131626647(0x7f0e0a97, float:1.8880536E38)
            android.view.View r12 = r2.inflate(r1, r5, r4)
            r1 = 2131431423(0x7f0b0fff, float:1.8484575E38)
            android.view.View r13 = r12.requireViewById(r1)
            X.0qQ.A07(r13)
            r1 = 2131431424(0x7f0b1000, float:1.8484577E38)
            android.view.View r2 = r12.requireViewById(r1)
            X.0qQ.A07(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = (com.instagram.common.ui.widget.imageview.IgImageView) r2
            r1 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.view.View r14 = r12.requireViewById(r1)
            X.0qQ.A07(r14)
            com.instagram.common.ui.base.IgTextView r14 = (com.instagram.common.ui.base.IgTextView) r14
            r1 = 2131435466(0x7f0b1fca, float:1.8492775E38)
            android.view.View r1 = r12.requireViewById(r1)
            X.0qQ.A07(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            X.52F r5 = new X.52F
            r11 = r5
            r15 = r2
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x007d
        L_0x013f:
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1 = 2131626650(0x7f0e0a9a, float:1.8880542E38)
            android.view.View r12 = r2.inflate(r1, r5, r4)
            r1 = 2131431424(0x7f0b1000, float:1.8484577E38)
            android.view.View r8 = r12.requireViewById(r1)
            X.0qQ.A0C(r8, r3)
            X.529 r8 = (X.AnonymousClass529) r8
            r1 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.view.View r6 = r12.requireViewById(r1)
            X.0qQ.A07(r6)
            com.instagram.common.ui.base.IgTextView r6 = (com.instagram.common.ui.base.IgTextView) r6
            r1 = 2131442048(0x7f0b3980, float:1.8506125E38)
            android.view.View r7 = r12.requireViewById(r1)
            X.0qQ.A07(r7)
            com.instagram.common.ui.base.IgTextView r7 = (com.instagram.common.ui.base.IgTextView) r7
            r1 = 2131429285(0x7f0b07a5, float:1.8480238E38)
            android.view.View r9 = r12.requireViewById(r1)
            X.0qQ.A07(r9)
            com.instagram.igds.components.button.IgdsButton r9 = (com.instagram.igds.components.button.IgdsButton) r9
            r1 = 2131435466(0x7f0b1fca, float:1.8492775E38)
            android.view.View r10 = r12.requireViewById(r1)
            X.0qQ.A07(r10)
            com.instagram.igds.components.button.IgdsButton r10 = (com.instagram.igds.components.button.IgdsButton) r10
            X.Uo1 r5 = new X.Uo1
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232392td.createView(int, android.view.ViewGroup):android.view.View");
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(972146114);
        0qQ.A0B(viewGroup, 2);
        0qQ.A0B(obj, 3);
        0qQ.A0B(obj2, 4);
        if (view == null) {
            view = createView(i, viewGroup);
        }
        bindView(i, view, obj, obj2);
        AnonymousClass0fD.A0A(1664974292, A03);
        return view;
    }
}
