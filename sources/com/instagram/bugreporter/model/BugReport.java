package com.instagram.bugreporter.model;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass409;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C16705V2i;
import X.C20435WrL;
import X.C255453u9;
import X.C255463uA;
import X.C258613zM;
import X.C258643zP;
import X.C258653zQ;
import X.C41847B3o;
import X.C41848B3p;
import X.C51974G9v;
import X.C66583MXo;
import X.C73532PeO;
import X.C73536PeS;
import X.C73538PeU;
import X.DbT;
import X.DbW;
import X.FK6;
import X.VJ6;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.bugreporter.source.BugReportSource;
import com.meta.flytrap.attachment.model.AttachmentCounter;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Serializable
public final class BugReport implements Parcelable {
    public static final C255463uA[] A0P;
    public static final Parcelable.Creator CREATOR = new FK6(97);
    public static final Companion Companion = new Object();
    public final BugReportSource A00;
    public final AttachmentCounter A01;
    public final AttachmentCounter A02;
    public final AttachmentCounter A03;
    public final AttachmentCounter A04;
    public final File A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final List A0J;
    public final List A0K;
    public final List A0L;
    public final List A0M;
    public final Map A0N;
    public final boolean A0O;

    public final class Companion {
        public final C255463uA serializer() {
            return C73532PeO.A00;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.instagram.bugreporter.model.BugReport$Companion] */
    static {
        C73536PeS peS = C73536PeS.A00;
        AnonymousClass409 r9 = new AnonymousClass409(peS);
        AnonymousClass409 r10 = new AnonymousClass409(new AnonymousClass409(peS));
        AnonymousClass409 r11 = new AnonymousClass409(peS);
        AnonymousClass409 r12 = new AnonymousClass409(peS);
        C258653zQ A002 = C258643zP.A00("com.instagram.bugreporter.source.BugReportSource", BugReportSource.values());
        C255453u9 r0 = C255453u9.A01;
        C258613zM r6 = new C258613zM(r0, r0);
        SerialDescriptor serialDescriptor = AttachmentCounter.A01;
        AnonymousClass0eM r1 = BugReportAttachmentMediaSource.A00;
        C255463uA r02 = (C255463uA) r1.getValue();
        0qQ.A0B(r02, 0);
        C73538PeU peU = new C73538PeU(r02);
        C255463uA r03 = (C255463uA) r1.getValue();
        0qQ.A0B(r03, 0);
        C73538PeU peU2 = new C73538PeU(r03);
        C255463uA r04 = (C255463uA) r1.getValue();
        0qQ.A0B(r04, 0);
        C73538PeU peU3 = new C73538PeU(r04);
        C255463uA r13 = (C255463uA) r1.getValue();
        0qQ.A0B(r13, 0);
        A0P = new C255463uA[]{null, null, r9, r10, r11, r12, null, null, null, null, A002, r6, null, null, null, null, null, null, null, null, peU, peU2, peU3, new C73538PeU(r13), null};
    }

    public BugReport(BugReportSource bugReportSource, AttachmentCounter attachmentCounter, AttachmentCounter attachmentCounter2, AttachmentCounter attachmentCounter3, AttachmentCounter attachmentCounter4, File file, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, List list2, List list3, List list4, Map map, boolean z) {
        List list5 = list;
        List list6 = list2;
        List list7 = list3;
        List list8 = list4;
        C51974G9v.A0d(3, list5, list6, list7, list8);
        Map map2 = map;
        DbW.A1P(bugReportSource, 11, map2);
        String str14 = str13;
        0qQ.A0B(str14, 20);
        C66583MXo.A0q(21, attachmentCounter, attachmentCounter2, attachmentCounter3, attachmentCounter4);
        this.A0A = str;
        this.A07 = str2;
        this.A0K = list5;
        this.A0L = list6;
        this.A0J = list7;
        this.A0M = list8;
        this.A08 = str3;
        this.A09 = str4;
        this.A0I = str5;
        this.A06 = str6;
        this.A00 = bugReportSource;
        this.A0N = map2;
        this.A0O = z;
        this.A0H = str7;
        this.A0B = str8;
        this.A0D = str9;
        this.A0C = str10;
        this.A0E = str11;
        this.A0F = str12;
        this.A0G = str14;
        this.A01 = attachmentCounter;
        this.A02 = attachmentCounter2;
        this.A03 = attachmentCounter3;
        this.A04 = attachmentCounter4;
        this.A05 = file;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
        Iterator A1F = C41848B3p.A1F(parcel, this.A0K);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        Iterator A1F2 = C41848B3p.A1F(parcel, this.A0L);
        while (A1F2.hasNext()) {
            Iterator A1F3 = C41848B3p.A1F(parcel, (List) A1F2.next());
            while (A1F3.hasNext()) {
                C41847B3o.A1I(parcel, A1F3, i);
            }
        }
        Iterator A1F4 = C41848B3p.A1F(parcel, this.A0J);
        while (A1F4.hasNext()) {
            C41847B3o.A1I(parcel, A1F4, i);
        }
        Iterator A1F5 = C41848B3p.A1F(parcel, this.A0M);
        while (A1F5.hasNext()) {
            C41847B3o.A1I(parcel, A1F5, i);
        }
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A06);
        AnonymousClass7TE.A1T(parcel, this.A00);
        Map map = this.A0N;
        parcel.writeInt(map.size());
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            parcel.writeString(DbT.A13(A1J));
            parcel.writeString((String) A1J.getValue());
        }
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeSerializable(this.A05);
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ BugReport(BugReportSource bugReportSource, AttachmentCounter attachmentCounter, AttachmentCounter attachmentCounter2, AttachmentCounter attachmentCounter3, AttachmentCounter attachmentCounter4, File file, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, List list2, List list3, List list4, Map map, int i, @Serializable(with = C20435WrL.class) boolean z) {
        int i2 = i;
        if (33553407 != (i & 33553407)) {
            VJ6.A00(C73532PeO.A01, i2, 33553407);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A0A = str;
        this.A07 = str2;
        this.A0K = list;
        this.A0L = list2;
        this.A0J = list3;
        this.A0M = list4;
        this.A08 = str3;
        this.A09 = str4;
        this.A0I = str5;
        this.A06 = str6;
        this.A00 = (i2 & 1024) == 0 ? BugReportSource.USER_OPTIONS : bugReportSource;
        this.A0N = map;
        this.A0O = z;
        this.A0H = str7;
        this.A0B = str8;
        this.A0D = str9;
        this.A0C = str10;
        this.A0E = str11;
        this.A0F = str12;
        this.A0G = str13;
        this.A01 = attachmentCounter;
        this.A02 = attachmentCounter2;
        this.A03 = attachmentCounter3;
        this.A04 = attachmentCounter4;
        this.A05 = file;
    }
}
