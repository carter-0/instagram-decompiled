package com.instagram.opal.impl.data;

import X.05G;
import X.0qQ;
import X.0sn;
import X.1Hj;
import X.1vm;
import X.1vn;
import X.AnonymousClass05K;
import X.AnonymousClass0T0;
import X.AnonymousClass43D;
import X.AnonymousClass4D7;
import X.AnonymousClass4HU;
import X.AnonymousClass4HW;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C252733pa;
import X.C335967dq;
import X.C41845B3m;
import X.C51966G9m;
import X.C59822JZw;
import X.C60340gF;
import X.C61048Jvm;
import X.C61077JwF;
import X.C62520KhB;
import X.C73554Pew;
import X.DbS;
import X.LVO;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class OpalAudienceSelectorRepository extends C252733pa {
    public C61077JwF A00;
    public C61077JwF A01;
    public final Context A02;
    public final AnonymousClass4HW A03 = C335967dq.A00(C59822JZw.A00);
    public final AnonymousClass4HW A04 = C335967dq.A00(AnonymousClass4HU.A00);
    public final UserSession A05;
    public final 1vn A06;
    public final 05G A07 = DbS.A10(new C61048Jvm((C62520KhB) null, (List) null, 255));

    public final class OpalAudience extends AnonymousClass0T0 implements Parcelable {
        public static final Parcelable.Creator CREATOR = new LVO(69);
        public final String A00;
        public final String A01;
        public final String A02;
        public final String A03;
        public final boolean A04;
        public final boolean A05;
        public final boolean A06;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof OpalAudience) {
                    OpalAudience opalAudience = (OpalAudience) obj;
                    if (!0qQ.A0K(this.A01, opalAudience.A01) || !0qQ.A0K(this.A03, opalAudience.A03) || this.A05 != opalAudience.A05 || this.A06 != opalAudience.A06 || !0qQ.A0K(this.A00, opalAudience.A00) || !0qQ.A0K(this.A02, opalAudience.A02) || this.A04 != opalAudience.A04) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeString(this.A01);
            parcel.writeString(this.A03);
            parcel.writeInt(this.A05 ? 1 : 0);
            parcel.writeInt(this.A06 ? 1 : 0);
            parcel.writeString(this.A00);
            parcel.writeString(this.A02);
            parcel.writeInt(this.A04 ? 1 : 0);
        }

        public final int hashCode() {
            int A09 = AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A01)));
            return DbS.A06(this.A04, (((AnonymousClass7TF.A09(this.A06, A09) + AnonymousClass7TG.A0E(this.A00)) * 31) + C41845B3m.A00(this.A02)) * 31);
        }

        public OpalAudience(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
            AnonymousClass7TG.A1O(str, str2);
            this.A01 = str;
            this.A03 = str2;
            this.A05 = z;
            this.A06 = z2;
            this.A00 = str3;
            this.A02 = str4;
            this.A04 = z3;
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013b, code lost:
        if (r7 != null) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.opal.impl.data.OpalAudienceSelectorRepository r16, java.lang.String r17, X.AnonymousClass4D7 r18) {
        /*
            r1 = r16
            r9 = r17
            r5 = 11
            r6 = r18
            boolean r0 = X.C66138MDq.A02(r5, r6)
            if (r0 == 0) goto L_0x01bb
            r4 = r6
            X.MDq r4 = (X.C66138MDq) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x01bb
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x001c:
            java.lang.Object r5 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0145
            if (r0 != r2) goto L_0x01f7
            java.lang.Object r1 = r4.A01
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository r1 = (com.instagram.opal.impl.data.OpalAudienceSelectorRepository) r1
            X.0eS.A00(r5)
        L_0x002e:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01dc
            java.lang.Object r5 = X.JTQ.A0Y(r5)
            if (r5 == 0) goto L_0x01dc
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x0142
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl$XdtOpal> r4 = com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl.XdtOpal.class
            X.3sh r0 = X.C250663lr.Companion
            r3 = -1645892878(0xffffffff9de5aaf2, float:-6.079255E-21)
            java.lang.String r0 = "xdt_opal(input:$input)"
            X.3lr r7 = r5.A05(r4, r0, r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl.XdtOpal"
            X.0qQ.A0C(r7, r0)
        L_0x0050:
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            if (r7 == 0) goto L_0x013a
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl$XdtOpal$SearchAudience> r4 = com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl.XdtOpal.SearchAudience.class
            r3 = 2114662413(0x7e0b300d, float:4.6253046E37)
            r0 = 770(0x302, float:1.079E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3lr r6 = r7.A05(r4, r0, r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl.XdtOpal.SearchAudience"
            X.0qQ.A0C(r6, r0)
            if (r6 == 0) goto L_0x013a
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl$XdtOpal$SearchAudience$PageInfo> r5 = com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl.XdtOpal.SearchAudience.PageInfo.class
            r3 = 1605480580(0x5fb1b084, float:2.5607758E19)
            r4 = 0
            java.lang.String r0 = "page_info"
            X.3lr r3 = r6.getRequiredTreeField(r4, r0, r5, r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl.XdtOpal.SearchAudience.PageInfo"
            X.0qQ.A0C(r3, r0)
            if (r3 == 0) goto L_0x013a
            java.lang.String r0 = "has_next_page"
            boolean r6 = r3.getRequiredBooleanField(r4, r0)
        L_0x0083:
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl$XdtOpal$SearchAudience> r4 = com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl.XdtOpal.SearchAudience.class
            r3 = 2114662413(0x7e0b300d, float:4.6253046E37)
            r0 = 770(0x302, float:1.079E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3lr r5 = r7.A05(r4, r0, r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl.XdtOpal.SearchAudience"
            X.0qQ.A0C(r5, r0)
            if (r5 == 0) goto L_0x013f
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl$XdtOpal$SearchAudience$PageInfo> r4 = com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl.XdtOpal.SearchAudience.PageInfo.class
            r3 = 1605480580(0x5fb1b084, float:2.5607758E19)
            java.lang.String r0 = "page_info"
            X.3lr r3 = r5.A05(r4, r0, r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl.XdtOpal.SearchAudience.PageInfo"
            X.0qQ.A0C(r3, r0)
            if (r3 == 0) goto L_0x013f
            java.lang.String r0 = "end_cursor"
            java.lang.String r4 = r3.getOptionalStringField(r2, r0)
        L_0x00b1:
            r3 = 14
            X.JwF r0 = new X.JwF
            r0.<init>((java.lang.Integer) r8, (java.lang.String) r4, (int) r3, (boolean) r6)
            r1.A01 = r0
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            X.05G r6 = r1.A07
            java.lang.Object r0 = r6.getValue()
            X.Jvm r0 = (X.C61048Jvm) r0
            java.lang.Object r0 = r0.A07
            java.util.Collection r0 = (java.util.Collection) r0
            r5.addAll(r0)
            if (r7 == 0) goto L_0x01c5
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl$XdtOpal$SearchAudience> r3 = com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl.XdtOpal.SearchAudience.class
            r1 = 2114662413(0x7e0b300d, float:4.6253046E37)
            r0 = 770(0x302, float:1.079E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3lr r4 = r7.A05(r3, r0, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl.XdtOpal.SearchAudience"
            X.0qQ.A0C(r4, r0)
            if (r4 == 0) goto L_0x01c5
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl$XdtOpal$SearchAudience$Edges> r3 = com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl.XdtOpal.SearchAudience.Edges.class
            r1 = -435883496(0xffffffffe604f218, float:-1.5695455E23)
            java.lang.String r0 = "edges"
            com.google.common.collect.ImmutableList r0 = r4.getRequiredCompactedTreeListField(r2, r0, r3, r1)
            if (r0 == 0) goto L_0x01c5
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r0.iterator()
        L_0x00fa:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01c2
            X.3lr r8 = X.C41845B3m.A0V(r9)
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl$XdtOpal$SearchAudience$Edges$Node> r4 = com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl.XdtOpal.SearchAudience.Edges.Node.class
            r3 = -266726937(0xfffffffff01a11e7, float:-1.9072934E29)
            r1 = 0
            java.lang.String r0 = "node"
            X.3lr r4 = r8.getRequiredTreeField(r1, r0, r4, r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl.XdtOpal.SearchAudience.Edges.Node"
            X.0qQ.A0C(r4, r0)
            java.lang.String r0 = "strong_id__"
            java.lang.String r3 = r4.getOptionalStringField(r1, r0)
            java.lang.String r0 = X.Dbj.A03()
            java.lang.String r1 = r4.getOptionalStringField(r2, r0)
            if (r3 == 0) goto L_0x00fa
            if (r1 == 0) goto L_0x00fa
            java.lang.String r0 = "selected"
            boolean r0 = r8.getRequiredBooleanField(r2, r0)
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository$OpalAudience r1 = X.JTT.A0c(r4, r3, r1, r0)
            X.GqO r0 = new X.GqO
            r0.<init>(r1)
            r7.add(r0)
            goto L_0x00fa
        L_0x013a:
            r6 = 0
            if (r7 == 0) goto L_0x013f
            goto L_0x0083
        L_0x013f:
            r4 = 0
            goto L_0x00b1
        L_0x0142:
            r7 = 0
            goto L_0x0050
        L_0x0145:
            X.0eS.A00(r5)
            X.0K0 r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r14 = 0
            com.instagram.common.session.UserSession r8 = r1.A05
            java.lang.String r5 = r8.A06
            java.lang.String r0 = "user_id"
            X.0Df r5 = X.C41845B3m.A03(r6, r5, r0)
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            java.lang.String r0 = "input"
            X.DbW.A18(r5, r6, r0)
            if (r17 != 0) goto L_0x0166
            java.lang.String r9 = ""
        L_0x0166:
            java.lang.String r0 = "search_query"
            r6.A04(r0, r9)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r8)
            r0.A2F()
            r13 = 0
            java.lang.String r0 = "skipExperimentCheck"
            r6.A01(r0)
            X.JwF r0 = r1.A01
            if (r0 == 0) goto L_0x01b9
            java.lang.String r5 = r0.A01
        L_0x017e:
            java.lang.String r0 = "after"
            r6.A04(r0, r5)
            r0 = 10000(0x2710, float:1.4013E-41)
            java.lang.Integer r5 = X.JTO.A0w(r0)
            java.lang.String r0 = "first"
            r6.A03(r0, r5)
            X.1vR r8 = X.C41845B3m.A05()
            java.util.Map r10 = r6.getParamsCopy()
            java.util.Map r11 = r7.getParamsCopy()
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl> r12 = com.instagram.opal.impl.graphql.GetOpalSearchAudienceQueryResponseImpl.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "GetOpalSearchAudienceQuery"
            java.lang.String r17 = "xdt_opal"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1vn r0 = r1.A06
            r4.A01 = r1
            r4.A00 = r2
            java.lang.Object r5 = r0.A04(r7, r4)
            if (r5 != r3) goto L_0x002e
            return r3
        L_0x01b9:
            r5 = 0
            goto L_0x017e
        L_0x01bb:
            X.MDq r4 = new X.MDq
            r4.<init>(r1, r6, r5)
            goto L_0x001c
        L_0x01c2:
            r5.addAll(r7)
        L_0x01c5:
            java.lang.Object r4 = r6.getValue()
            r3 = r4
            X.Jvm r3 = (X.C61048Jvm) r3
            X.KhB r2 = X.C62520KhB.Loaded
            r1 = 0
            r0 = 221(0xdd, float:3.1E-43)
            X.Jvm r0 = X.C61048Jvm.A00(r3, r2, r1, (java.lang.Integer) null, (java.lang.String) null, (java.util.List) null, r5, (java.util.List) null, 0, r0)
            boolean r0 = r6.AIY(r4, r0)
            if (r0 == 0) goto L_0x01c5
            goto L_0x01f4
        L_0x01dc:
            X.05G r5 = r1.A07
        L_0x01de:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            X.Jvm r3 = (X.C61048Jvm) r3
            r2 = 0
            X.KhB r1 = X.C62520KhB.Error
            r0 = 223(0xdf, float:3.12E-43)
            X.Jvm r0 = X.C61048Jvm.A00(r3, r1, r2, (java.lang.Integer) null, (java.lang.String) null, (java.util.List) null, r2, (java.util.List) null, 0, r0)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x01de
        L_0x01f4:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x01f7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalAudienceSelectorRepository.A00(com.instagram.opal.impl.data.OpalAudienceSelectorRepository, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v14, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0214, code lost:
        if (r6 != null) goto L_0x0146;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.opal.impl.data.OpalAudienceSelectorRepository r23, X.AnonymousClass4D7 r24) {
        /*
            r0 = r23
            r5 = 26
            r6 = r24
            boolean r1 = X.ME0.A02(r5, r6)
            if (r1 == 0) goto L_0x024e
            r1 = r6
            X.ME0 r1 = (X.ME0) r1
            int r4 = r1.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x024e
            int r4 = r4 - r3
            r1.A00 = r4
        L_0x001a:
            java.lang.Object r9 = r1.A05
            X.1Hj r3 = X.1Hj.A02
            int r5 = r1.A00
            r4 = 2
            r12 = 0
            r2 = 1
            if (r5 == 0) goto L_0x0089
            if (r5 == r2) goto L_0x00ed
            if (r5 != r4) goto L_0x0255
            java.lang.Object r8 = r1.A04
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r1.A03
            X.0rm r7 = (X.0rm) r7
            java.lang.Object r6 = r1.A02
            X.3lr r6 = (X.C250663lr) r6
            java.lang.Object r0 = r1.A01
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository r0 = (com.instagram.opal.impl.data.OpalAudienceSelectorRepository) r0
            X.0eS.A00(r9)
        L_0x003c:
            X.Jvm r9 = (X.C61048Jvm) r9
            java.lang.Object r1 = r9.A03
            r7.A00 = r1
            java.lang.Object r4 = r9.A04
            java.util.List r4 = (java.util.List) r4
            boolean r1 = X.AnonymousClass7TE.A1b(r4)
            if (r1 == 0) goto L_0x0056
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.GqP r1 = new X.GqP
            r1.<init>(r3, r2)
            r8.add(r1)
        L_0x0056:
            r8.addAll(r4)
        L_0x0059:
            X.05G r5 = r0.A07
        L_0x005b:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            X.Jvm r3 = (X.C61048Jvm) r3
            java.lang.Object r2 = r7.A00
            X.KhB r2 = (X.C62520KhB) r2
            if (r6 == 0) goto L_0x0086
            r1 = 0
            java.lang.String r0 = "selected_audience_count"
            int r17 = r6.getRequiredIntField(r1, r0)
        L_0x006f:
            r18 = 218(0xda, float:3.05E-43)
            r9 = r3
            r10 = r2
            r11 = r12
            r13 = r12
            r14 = r8
            r15 = r12
            r16 = r12
            X.Jvm r0 = X.C61048Jvm.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x005b
        L_0x0083:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0086:
            r17 = 0
            goto L_0x006f
        L_0x0089:
            X.0eS.A00(r9)
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            com.instagram.common.session.UserSession r5 = r0.A05
            java.lang.String r6 = r5.A06
            java.lang.String r5 = "user_id"
            X.0Df r6 = X.C41845B3m.A03(r7, r6, r5)
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            java.lang.String r5 = "input"
            X.DbW.A18(r6, r8, r5)
            X.JwF r5 = r0.A00
            if (r5 == 0) goto L_0x00eb
            java.lang.String r6 = r5.A01
        L_0x00ab:
            java.lang.String r5 = "after"
            r8.A04(r5, r6)
            r5 = 10000(0x2710, float:1.4013E-41)
            java.lang.Integer r6 = X.JTO.A0w(r5)
            java.lang.String r5 = "first"
            r8.A03(r5, r6)
            X.1vR r14 = X.C41845B3m.A05()
            java.util.Map r16 = r8.getParamsCopy()
            java.util.Map r17 = r7.getParamsCopy()
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl> r18 = com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl.class
            java.util.ArrayList r24 = X.AnonymousClass7TE.A1C()
            java.lang.String r15 = "GetOpalSelectedAudienceQuery"
            r19 = 0
            java.lang.String r23 = "xdt_opal"
            com.facebook.pando.PandoGraphQLRequest r13 = new com.facebook.pando.PandoGraphQLRequest
            r21 = r19
            r22 = r12
            r20 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.1vn r5 = r0.A06
            r1.A01 = r0
            r1.A00 = r2
            java.lang.Object r9 = r5.A04(r13, r1)
            if (r9 != r3) goto L_0x00f4
            return r3
        L_0x00eb:
            r6 = r12
            goto L_0x00ab
        L_0x00ed:
            java.lang.Object r0 = r1.A01
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository r0 = (com.instagram.opal.impl.data.OpalAudienceSelectorRepository) r0
            X.0eS.A00(r9)
        L_0x00f4:
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r5 = r9 instanceof X.C239793Ih
            if (r5 == 0) goto L_0x0235
            java.lang.Object r8 = X.JTQ.A0Y(r9)
            if (r8 == 0) goto L_0x0235
            X.3lr r8 = (X.C250663lr) r8
            if (r8 == 0) goto L_0x021b
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl$XdtOpal> r7 = com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl.XdtOpal.class
            X.3sh r5 = X.C250663lr.Companion
            r6 = -329775722(0xffffffffec580596, float:-1.0446174E27)
            java.lang.String r5 = "xdt_opal(input:$input)"
            X.3lr r6 = r8.A05(r7, r5, r6)
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl.XdtOpal"
            X.0qQ.A0C(r6, r5)
        L_0x0116:
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            if (r6 == 0) goto L_0x0213
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl$XdtOpal$Audience> r8 = com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl.XdtOpal.Audience.class
            X.3sh r5 = X.C250663lr.Companion
            r7 = -1524343173(0xffffffffa5245e7b, float:-1.4256744E-16)
            r5 = 515(0x203, float:7.22E-43)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            X.3lr r11 = r6.getOptionalTreeField(r2, r5, r8, r7)
            if (r11 == 0) goto L_0x0213
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl$XdtOpal$Audience$PageInfo> r9 = com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl.XdtOpal.Audience.PageInfo.class
            r7 = 2059302573(0x7abe76ad, float:4.944717E35)
            r8 = 0
            java.lang.String r5 = "page_info"
            X.3lr r7 = r11.getRequiredTreeField(r8, r5, r9, r7)
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl.XdtOpal.Audience.PageInfo"
            X.0qQ.A0C(r7, r5)
            if (r7 == 0) goto L_0x0213
            java.lang.String r5 = "has_next_page"
            boolean r9 = r7.getRequiredBooleanField(r8, r5)
        L_0x0146:
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl$XdtOpal$Audience> r8 = com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl.XdtOpal.Audience.class
            X.3sh r5 = X.C250663lr.Companion
            r7 = -1524343173(0xffffffffa5245e7b, float:-1.4256744E-16)
            r5 = 515(0x203, float:7.22E-43)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            X.3lr r11 = r6.getOptionalTreeField(r2, r5, r8, r7)
            if (r11 == 0) goto L_0x0218
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl$XdtOpal$Audience$PageInfo> r8 = com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl.XdtOpal.Audience.PageInfo.class
            r7 = 2059302573(0x7abe76ad, float:4.944717E35)
            java.lang.String r5 = "page_info"
            X.3lr r7 = r11.A05(r8, r5, r7)
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl.XdtOpal.Audience.PageInfo"
            X.0qQ.A0C(r7, r5)
            if (r7 == 0) goto L_0x0218
            java.lang.String r5 = "end_cursor"
            java.lang.String r8 = r7.getOptionalStringField(r2, r5)
        L_0x0171:
            r7 = 14
            X.JwF r5 = new X.JwF
            r5.<init>((java.lang.Integer) r10, (java.lang.String) r8, (int) r7, (boolean) r9)
            r0.A00 = r5
            X.0rm r7 = X.C51965G9l.A11()
            X.KhB r5 = X.C62520KhB.Loaded
            r7.A00 = r5
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            X.05G r5 = r0.A07
            java.lang.Object r5 = r5.getValue()
            X.Jvm r5 = (X.C61048Jvm) r5
            java.lang.Object r5 = r5.A04
            java.util.Collection r5 = (java.util.Collection) r5
            r8.addAll(r5)
            if (r6 == 0) goto L_0x0221
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl$XdtOpal$Audience> r10 = com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl.XdtOpal.Audience.class
            X.3sh r5 = X.C250663lr.Companion
            r9 = -1524343173(0xffffffffa5245e7b, float:-1.4256744E-16)
            r5 = 515(0x203, float:7.22E-43)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            X.3lr r11 = r6.getOptionalTreeField(r2, r5, r10, r9)
            if (r11 == 0) goto L_0x0221
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl$XdtOpal$Audience$Edges> r10 = com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl.XdtOpal.Audience.Edges.class
            r9 = -398773314(0xffffffffe83b33be, float:-3.536148E24)
            java.lang.String r5 = "edges"
            com.google.common.collect.ImmutableList r5 = r11.getRequiredCompactedTreeListField(r2, r5, r10, r9)
            if (r5 == 0) goto L_0x0221
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r15 = r5.iterator()
        L_0x01bf:
            boolean r5 = r15.hasNext()
            if (r5 == 0) goto L_0x021e
            X.3lr r14 = X.C41845B3m.A0V(r15)
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl$XdtOpal$Audience$Edges$Node> r13 = com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl.XdtOpal.Audience.Edges.Node.class
            r11 = 2062210767(0x7aead6cf, float:6.0967715E35)
            r9 = 0
            java.lang.String r5 = "node"
            X.3lr r11 = r14.getRequiredTreeField(r9, r5, r13, r11)
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalSelectedAudienceQueryResponseImpl.XdtOpal.Audience.Edges.Node"
            X.0qQ.A0C(r11, r5)
            java.lang.String r5 = "strong_id__"
            java.lang.String r17 = r11.getOptionalStringField(r9, r5)
            java.lang.String r5 = X.Dbj.A03()
            java.lang.String r18 = r11.getOptionalStringField(r2, r5)
            if (r17 == 0) goto L_0x01bf
            if (r18 == 0) goto L_0x01bf
            r13 = 4
            java.lang.String r5 = "is_verified"
            boolean r22 = r11.getCoercedBooleanField(r13, r5)
            java.lang.String r5 = "full_name"
            java.lang.String r19 = r11.getOptionalStringField(r4, r5)
            java.lang.String r5 = "profile_pic_url"
            java.lang.String r20 = r11.A0A(r5)
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository$OpalAudience r5 = new com.instagram.opal.impl.data.OpalAudienceSelectorRepository$OpalAudience
            r21 = r2
            r23 = r9
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            X.GqO r9 = new X.GqO
            r9.<init>(r5)
            r10.add(r9)
            goto L_0x01bf
        L_0x0213:
            r9 = 0
            if (r6 == 0) goto L_0x0218
            goto L_0x0146
        L_0x0218:
            r8 = r12
            goto L_0x0171
        L_0x021b:
            r6 = r12
            goto L_0x0116
        L_0x021e:
            r8.addAll(r10)
        L_0x0221:
            X.JwF r5 = r0.A00
            if (r5 == 0) goto L_0x0059
            boolean r5 = r5.A02
            if (r5 != 0) goto L_0x0059
            X.ME0.A00(r0, r6, r7, r8, r1)
            r1.A00 = r4
            java.lang.Object r9 = A03(r0, r1)
            if (r9 != r3) goto L_0x003c
            return r3
        L_0x0235:
            X.05G r4 = r0.A07
        L_0x0237:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.Jvm r2 = (X.C61048Jvm) r2
            X.KhB r1 = X.C62520KhB.Error
            r0 = 223(0xdf, float:3.12E-43)
            X.Jvm r0 = X.C61048Jvm.A00(r2, r1, r12, (java.lang.Integer) null, (java.lang.String) null, (java.util.List) null, r12, (java.util.List) null, 0, r0)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x0237
            goto L_0x0083
        L_0x024e:
            X.ME0 r1 = new X.ME0
            r1.<init>(r0, r6, r5)
            goto L_0x001a
        L_0x0255:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalAudienceSelectorRepository.A01(com.instagram.opal.impl.data.OpalAudienceSelectorRepository, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.opal.impl.data.OpalAudienceSelectorRepository r12, X.AnonymousClass4D7 r13) {
        /*
            r3 = 12
            boolean r0 = X.C66138MDq.A02(r3, r13)
            if (r0 == 0) goto L_0x0093
            r4 = r13
            X.MDq r4 = (X.C66138MDq) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0093
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0064
            if (r0 != r1) goto L_0x009a
            java.lang.Object r12 = r4.A01
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository r12 = (com.instagram.opal.impl.data.OpalAudienceSelectorRepository) r12
            X.0eS.A00(r3)
        L_0x0028:
            X.Jvm r3 = (X.C61048Jvm) r3
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            X.05G r2 = r12.A07
            java.lang.Object r0 = r2.getValue()
            X.Jvm r0 = (X.C61048Jvm) r0
            java.lang.Object r0 = r0.A04
            java.util.Collection r0 = (java.util.Collection) r0
            r9.addAll(r0)
            java.lang.Object r0 = r3.A04
            java.util.Collection r0 = (java.util.Collection) r0
            r9.addAll(r0)
        L_0x0044:
            java.lang.Object r1 = r2.getValue()
            r4 = r1
            X.Jvm r4 = (X.C61048Jvm) r4
            java.lang.Object r5 = r3.A03
            X.KhB r5 = (X.C62520KhB) r5
            r6 = 0
            r12 = 0
            r13 = 222(0xde, float:3.11E-43)
            r7 = r6
            r8 = r6
            r10 = r6
            r11 = r6
            X.Jvm r0 = X.C61048Jvm.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0044
        L_0x0061:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0064:
            X.0eS.A00(r3)
            X.JwF r0 = r12.A00
            if (r0 == 0) goto L_0x007a
            boolean r0 = r0.A02
            if (r0 != r1) goto L_0x007a
            r4.A01 = r12
            r4.A00 = r1
            java.lang.Object r3 = A03(r12, r4)
            if (r3 != r2) goto L_0x0028
            return r2
        L_0x007a:
            X.05G r5 = r12.A07
        L_0x007c:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            X.Jvm r3 = (X.C61048Jvm) r3
            r2 = 0
            X.KhB r1 = X.C62520KhB.Loaded
            r0 = 223(0xdf, float:3.12E-43)
            X.Jvm r0 = X.C61048Jvm.A00(r3, r1, r2, (java.lang.Integer) null, (java.lang.String) null, (java.util.List) null, r2, (java.util.List) null, 0, r0)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x007c
            goto L_0x0061
        L_0x0093:
            X.MDq r4 = new X.MDq
            r4.<init>(r12, r13, r3)
            goto L_0x0016
        L_0x009a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalAudienceSelectorRepository.A02(com.instagram.opal.impl.data.OpalAudienceSelectorRepository, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.opal.impl.data.OpalAudienceSelectorRepository r6, X.AnonymousClass4D7 r7) {
        /*
            r3 = 13
            boolean r0 = X.C66138MDq.A02(r3, r7)
            if (r0 == 0) goto L_0x004b
            r5 = r7
            X.MDq r5 = (X.C66138MDq) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A02
            X.1Hj r2 = X.1Hj.A02
            int r1 = r5.A00
            r0 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 != r0) goto L_0x0051
            java.lang.Object r3 = r5.A01
            java.util.List r3 = (java.util.List) r3
            X.0eS.A00(r4)
        L_0x0028:
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L_0x0039
            r3.addAll(r4)
            X.KhB r2 = X.C62520KhB.Loaded
        L_0x0031:
            r1 = 222(0xde, float:3.11E-43)
            X.Jvm r0 = new X.Jvm
            r0.<init>(r2, r3, r1)
            return r0
        L_0x0039:
            X.KhB r2 = X.C62520KhB.Error
            goto L_0x0031
        L_0x003c:
            java.util.ArrayList r3 = X.JTQ.A0e(r4)
            r5.A01 = r3
            r5.A00 = r0
            java.lang.Object r4 = A04(r6, r5)
            if (r4 != r2) goto L_0x0028
            return r2
        L_0x004b:
            X.MDq r5 = new X.MDq
            r5.<init>(r6, r7, r3)
            goto L_0x0016
        L_0x0051:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalAudienceSelectorRepository.A03(com.instagram.opal.impl.data.OpalAudienceSelectorRepository, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(com.instagram.opal.impl.data.OpalAudienceSelectorRepository r18, X.AnonymousClass4D7 r19) {
        /*
            r3 = r18
            r4 = 14
            r6 = r19
            boolean r0 = X.C66138MDq.A02(r4, r6)
            if (r0 == 0) goto L_0x019a
            r5 = r6
            X.MDq r5 = (X.C66138MDq) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x019a
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001a:
            java.lang.Object r6 = r5.A02
            X.1Hj r0 = X.1Hj.A02
            int r2 = r5.A00
            r1 = 1
            if (r2 == 0) goto L_0x012f
            if (r2 != r1) goto L_0x01b2
            java.lang.Object r3 = r5.A01
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository r3 = (com.instagram.opal.impl.data.OpalAudienceSelectorRepository) r3
            X.0eS.A00(r6)
        L_0x002c:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C239793Ih
            r8 = 0
            if (r0 == 0) goto L_0x01a7
            java.lang.Object r7 = X.JTQ.A0Y(r6)
            if (r7 == 0) goto L_0x01a7
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            X.3lr r7 = (X.C250663lr) r7
            if (r7 == 0) goto L_0x012c
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl$XdtOpal> r6 = com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl.XdtOpal.class
            X.3sh r2 = X.C250663lr.Companion
            r5 = -1330464266(0xffffffffb0b2b9f6, float:-1.3004058E-9)
            java.lang.String r2 = "xdt_opal(input:$input)"
            X.3lr r6 = r7.getRequiredTreeField(r8, r2, r6, r5)
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl.XdtOpal"
            X.0qQ.A0C(r6, r2)
        L_0x0053:
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            if (r6 == 0) goto L_0x0129
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl$XdtOpal$SuggestedAudiencePaginated> r12 = com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl.XdtOpal.SuggestedAudiencePaginated.class
            r11 = -1843339477(0xffffffff9220df2b, float:-5.0762174E-28)
            r2 = 1859(0x743, float:2.605E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r2)
            X.3lr r14 = r6.A05(r12, r9, r11)
            java.lang.String r7 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl.XdtOpal.SuggestedAudiencePaginated"
            X.0qQ.A0C(r14, r7)
            if (r14 == 0) goto L_0x0085
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl$XdtOpal$SuggestedAudiencePaginated$PageInfo> r13 = com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl.XdtOpal.SuggestedAudiencePaginated.PageInfo.class
            r5 = 2041944670(0x79b59a5e, float:1.1786708E35)
            java.lang.String r2 = "page_info"
            X.3lr r5 = r14.getRequiredTreeField(r8, r2, r13, r5)
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl.XdtOpal.SuggestedAudiencePaginated.PageInfo"
            X.0qQ.A0C(r5, r2)
            if (r5 == 0) goto L_0x0085
            java.lang.String r2 = "has_next_page"
            boolean r8 = r5.getRequiredBooleanField(r8, r2)
        L_0x0085:
            X.3lr r9 = r6.A05(r12, r9, r11)
            X.0qQ.A0C(r9, r7)
            if (r9 == 0) goto L_0x0129
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl$XdtOpal$SuggestedAudiencePaginated$PageInfo> r7 = com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl.XdtOpal.SuggestedAudiencePaginated.PageInfo.class
            r5 = 2041944670(0x79b59a5e, float:1.1786708E35)
            java.lang.String r2 = "page_info"
            X.3lr r5 = r9.A05(r7, r2, r5)
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl.XdtOpal.SuggestedAudiencePaginated.PageInfo"
            X.0qQ.A0C(r5, r2)
            if (r5 == 0) goto L_0x0129
            java.lang.String r2 = "end_cursor"
            java.lang.String r5 = r5.getOptionalStringField(r1, r2)
        L_0x00a6:
            X.JwF r2 = new X.JwF
            r2.<init>((java.lang.Integer) r10, (java.lang.String) r5, (int) r4, (boolean) r8)
            r3.A00 = r2
            if (r6 == 0) goto L_0x01a1
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl$XdtOpal$SuggestedAudiencePaginated> r4 = com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl.XdtOpal.SuggestedAudiencePaginated.class
            r3 = -1843339477(0xffffffff9220df2b, float:-5.0762174E-28)
            r2 = 1859(0x743, float:2.605E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.3lr r5 = r6.A05(r4, r2, r3)
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl.XdtOpal.SuggestedAudiencePaginated"
            X.0qQ.A0C(r5, r2)
            if (r5 == 0) goto L_0x01a1
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl$XdtOpal$SuggestedAudiencePaginated$Edges> r4 = com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl.XdtOpal.SuggestedAudiencePaginated.Edges.class
            r3 = 141969700(0x8764924, float:7.411391E-34)
            java.lang.String r2 = "edges"
            com.google.common.collect.ImmutableList r2 = r5.getRequiredCompactedTreeListField(r1, r2, r4, r3)
            if (r2 == 0) goto L_0x01a1
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r2.iterator()
        L_0x00da:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x01a3
            X.3lr r6 = X.C41845B3m.A0V(r7)
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl$XdtOpal$SuggestedAudiencePaginated$Edges$Node> r5 = com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl.XdtOpal.SuggestedAudiencePaginated.Edges.Node.class
            r3 = -341997121(0xffffffffeb9d89bf, float:-3.809037E26)
            r13 = 0
            java.lang.String r2 = "node"
            X.3lr r5 = r6.getRequiredTreeField(r13, r2, r5, r3)
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl.XdtOpal.SuggestedAudiencePaginated.Edges.Node"
            X.0qQ.A0C(r5, r2)
            java.lang.String r2 = "strong_id__"
            java.lang.String r9 = r5.getOptionalStringField(r13, r2)
            java.lang.String r2 = X.Dbj.A03()
            java.lang.String r10 = r5.getOptionalStringField(r1, r2)
            if (r9 == 0) goto L_0x00da
            if (r10 == 0) goto L_0x00da
            r3 = 4
            java.lang.String r2 = "is_verified"
            boolean r14 = r5.getCoercedBooleanField(r3, r2)
            java.lang.String r2 = "full_name"
            java.lang.String r11 = r5.A09(r2)
            java.lang.String r2 = "profile_pic_url"
            java.lang.String r12 = r5.A0A(r2)
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository$OpalAudience r8 = new com.instagram.opal.impl.data.OpalAudienceSelectorRepository$OpalAudience
            r15 = r13
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            X.GqO r2 = new X.GqO
            r2.<init>(r8)
            r4.add(r2)
            goto L_0x00da
        L_0x0129:
            r5 = 0
            goto L_0x00a6
        L_0x012c:
            r6 = 0
            goto L_0x0053
        L_0x012f:
            X.0eS.A00(r6)
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r15 = 0
            com.instagram.common.session.UserSession r9 = r3.A05
            java.lang.String r6 = r9.A06
            java.lang.String r2 = "user_id"
            X.0Df r6 = X.C41845B3m.A03(r7, r6, r2)
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r8 = X.C41845B3m.A04()
            java.lang.String r2 = "input"
            X.DbW.A18(r6, r7, r2)
            com.instagram.user.model.User r2 = X.AnonymousClass7TF.A0Q(r9)
            r2.A2F()
            r14 = 0
            java.lang.String r2 = "skipExperimentCheck"
            r7.A01(r2)
            r2 = 10000(0x2710, float:1.4013E-41)
            java.lang.Integer r6 = X.JTO.A0w(r2)
            java.lang.String r2 = "first"
            r7.A03(r2, r6)
            X.JwF r2 = r3.A00
            if (r2 == 0) goto L_0x0198
            java.lang.String r6 = r2.A01
        L_0x016a:
            java.lang.String r2 = "after"
            X.1vR r9 = X.DbU.A0J(r7, r2, r6)
            java.util.Map r11 = r7.getParamsCopy()
            java.util.Map r12 = r8.getParamsCopy()
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl> r13 = com.instagram.opal.impl.graphql.GetOpalSuggestedAudienceQueryResponseImpl.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "GetOpalSuggestedAudienceQuery"
            java.lang.String r18 = "xdt_opal"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1vn r2 = r3.A06
            r5.A01 = r3
            r5.A00 = r1
            java.lang.Object r6 = r2.A04(r8, r5)
            if (r6 != r0) goto L_0x002c
            return r0
        L_0x0198:
            r6 = 0
            goto L_0x016a
        L_0x019a:
            X.MDq r5 = new X.MDq
            r5.<init>(r3, r6, r4)
            goto L_0x001a
        L_0x01a1:
            X.0sn r4 = X.0sn.A00
        L_0x01a3:
            r0.addAll(r4)
            return r0
        L_0x01a7:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            r0 = 0
            X.JwF r1 = new X.JwF
            r1.<init>((java.lang.Integer) r2, (java.lang.String) r0, (int) r4, (boolean) r8)
            r3.A00 = r1
            return r0
        L_0x01b2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalAudienceSelectorRepository.A04(com.instagram.opal.impl.data.OpalAudienceSelectorRepository, X.4D7):java.lang.Object");
    }

    public final Object A05(String str, AnonymousClass4D7 r20) {
        Integer num;
        0sn r9;
        C61077JwF jwF;
        Object value;
        String str2 = str;
        if (str == null || str2.length() == 0) {
            C61077JwF jwF2 = this.A00;
            if (jwF2 == null || (num = (Integer) jwF2.A00) == null) {
                num = (Integer) ((C61048Jvm) this.A07.getValue()).A02;
            }
        } else {
            num = AnonymousClass05K.A00;
        }
        05G r2 = this.A07;
        boolean A1a = C51966G9m.A1a(((C61048Jvm) r2.getValue()).A08, str2);
        if (A1a) {
            this.A01 = null;
            r9 = 0sn.A00;
        } else {
            r9 = (List) ((C61048Jvm) r2.getValue()).A07;
        }
        boolean z = false;
        if (num == AnonymousClass05K.A00) {
            jwF = this.A01;
        } else {
            jwF = this.A00;
        }
        if (jwF == null || jwF.A02) {
            z = true;
        }
        if (A1a || z) {
            do {
                value = r2.getValue();
            } while (!r2.AIY(value, C61048Jvm.A00((C61048Jvm) value, (C62520KhB) null, (C62520KhB) null, num, str2, (List) null, r9, (List) null, 0, 229)));
            Object A002 = this.A03.A00(C60340gF.A00, r20, new C73554Pew(this, num, str2, r9, (AnonymousClass4D7) null));
            if (A002 == 1Hj.A02) {
                return A002;
            }
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OpalAudienceSelectorRepository(Context context, UserSession userSession) {
        super("Opal", AnonymousClass43D.A01(72627069, 3));
        1vn A012 = 1vm.A01(userSession);
        AnonymousClass7TG.A1O(context, userSession);
        0qQ.A0B(A012, 3);
        this.A02 = context;
        this.A05 = userSession;
        this.A06 = A012;
    }
}
