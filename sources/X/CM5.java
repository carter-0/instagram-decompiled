package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ImmutablePandoNoteCustomTheme;
import com.instagram.api.schemas.ImmutablePandoNoteEmojiReactionInfo;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CM5 extends 17P implements C2809354u {
    public User A00;
    public List A01;
    public List A02;

    public final /* synthetic */ C56009HrH AKG() {
        return new C56009HrH(this);
    }

    public final NoteCustomTheme Auz() {
        return (NoteCustomTheme) A05(731007867, ImmutablePandoNoteCustomTheme.class);
    }

    public final List Azi() {
        return this.A01;
    }

    public final List Bjr() {
        List list = this.A02;
        if (list == null) {
            return A08(-1122997398, ImmutablePandoNoteEmojiReactionInfo.class);
        }
        return list;
    }

    public final User CCd() {
        return this.A00;
    }

    public final C2809354u E7X(1E9 r4) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ImmutableList A08 = A08(486741610, ImmutablePandoUserDict.class);
        if (A08 != null) {
            arrayList = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1P(r4, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        List<NoteEmojiReactionInfoIntf> Bjr = Bjr();
        if (Bjr != null) {
            arrayList2 = AnonymousClass7TG.A0r(Bjr);
            for (NoteEmojiReactionInfoIntf noteEmojiReactionInfoIntf : Bjr) {
                noteEmojiReactionInfoIntf.E7n(r4);
                arrayList2.add(noteEmojiReactionInfoIntf);
            }
        } else {
            arrayList2 = null;
        }
        this.A02 = arrayList2;
        this.A00 = C41847B3o.A0y(r4, this);
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CM5, X.54u] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C54802HTj.A00(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CM5] */
    public final Integer AdI() {
        return getOptionalIntValueByHashCode(975628804);
    }

    public final Long AsC() {
        return A0L(1369680106);
    }

    public final Long B2l() {
        return A0L(-833811170);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CM5] */
    public final Boolean BCJ() {
        return getOptionalBooleanValueByHashCode(-1472279412);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CM5] */
    public final Boolean CF2() {
        return getOptionalBooleanValueByHashCode(-778200101);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C2809254t F5s(X.1E9 r20) {
        /*
            r19 = this;
            r0 = 975628804(0x3a26ea04, float:6.3672685E-4)
            r3 = r19
            java.lang.Integer r10 = r3.getOptionalIntValueByHashCode(r0)
            r0 = 1369680106(0x51a3a8ea, float:8.7864197E10)
            java.lang.Long r11 = r3.A0L(r0)
            com.instagram.api.schemas.NoteCustomTheme r0 = r3.Auz()
            r7 = 0
            if (r0 == 0) goto L_0x003a
            com.instagram.api.schemas.NoteCustomThemeImpl r6 = r0.F6q()
        L_0x001b:
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r1 = com.instagram.user.model.ImmutablePandoUserDict.class
            r0 = 486741610(0x1d03166a, float:1.7349293E-21)
            com.google.common.collect.ImmutableList r0 = r3.A08(r0, r1)
            r4 = r20
            if (r0 == 0) goto L_0x0050
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0030:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003c
            X.C41847B3o.A1P(r4, r5, r1)
            goto L_0x0030
        L_0x003a:
            r6 = r7
            goto L_0x001b
        L_0x003c:
            if (r5 == 0) goto L_0x0050
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r5)
            java.util.Iterator r1 = r5.iterator()
        L_0x0046:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0051
            X.C41847B3o.A1Q(r4, r2, r1)
            goto L_0x0046
        L_0x0050:
            r2 = r7
        L_0x0051:
            r0 = -833811170(0xffffffffce4d0d1e, float:-8.6004723E8)
            java.lang.Long r12 = r3.A0L(r0)
            r0 = -1472279412(0xffffffffa83ecc8c, float:-1.0591473E-14)
            java.lang.Boolean r8 = r3.getOptionalBooleanValueByHashCode(r0)
            java.lang.String r13 = r3.A0e()
            java.lang.String r14 = r3.A0f()
            java.util.List r0 = r3.Bjr()
            if (r0 == 0) goto L_0x0089
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x0075:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = r5.next()
            com.instagram.api.schemas.NoteEmojiReactionInfoIntf r0 = (com.instagram.api.schemas.NoteEmojiReactionInfoIntf) r0
            com.instagram.api.schemas.NoteEmojiReactionInfo r0 = r0.F6r(r4)
            r1.add(r0)
            goto L_0x0075
        L_0x0089:
            r1 = r7
        L_0x008a:
            java.lang.String r15 = r3.A0X()
            com.instagram.user.model.ImmutablePandoUserDict r0 = X.C41846B3n.A0Z(r3)
            if (r0 == 0) goto L_0x009e
            com.instagram.user.model.User r0 = X.C41845B3m.A0b(r4, r0)
            if (r0 == 0) goto L_0x009e
            com.instagram.user.model.User r7 = X.C41846B3n.A0b(r4, r0)
        L_0x009e:
            java.lang.String r16 = X.C41845B3m.A0n(r3)
            r0 = -778200101(0xffffffffd19d9bdb, float:-8.4615586E10)
            java.lang.Boolean r9 = r3.getOptionalBooleanValueByHashCode(r0)
            X.54t r5 = new X.54t
            r17 = r2
            r18 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CM5.F5s(X.1E9):X.54t");
    }

    public final String getId() {
        return A0e();
    }

    public final String getMediaId() {
        return A0f();
    }

    public final String getText() {
        return A0X();
    }

    public final String getUserId() {
        return C41845B3m.A0n(this);
    }
}
