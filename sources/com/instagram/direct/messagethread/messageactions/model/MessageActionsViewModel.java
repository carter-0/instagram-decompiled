package com.instagram.direct.messagethread.messageactions.model;

import X.0qQ;
import X.2FW;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.C41848B3p;
import X.C63898LBc;
import X.LVP;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.aistudio.logging.AiStudioLoggingData;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Iterator;
import java.util.List;

public final class MessageActionsViewModel implements Parcelable {
    public static final C63898LBc A0a = new Object();
    public static final Parcelable.Creator CREATOR = LVP.A00(89);
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public PointF A04;
    public Rect A05;
    public AiStudioLoggingData A06;
    public 2FW A07;
    public MessageIdentifier A08;
    public Boolean A09;
    public Integer A0A;
    public Integer A0B;
    public Long A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public List A0L;
    public List A0M;
    public List A0N;
    public List A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A08, i);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        Iterator A1F = C41848B3p.A1F(parcel, this.A0L);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        Iterator A1F2 = C41848B3p.A1F(parcel, this.A0O);
        while (A1F2.hasNext()) {
            C41847B3o.A1I(parcel, A1F2, i);
        }
        parcel.writeString(this.A0K);
        parcel.writeLong(this.A03);
        2FW r0 = this.A07;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AnonymousClass7TE.A1T(parcel, r0);
        }
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeStringList(this.A0N);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0J);
        parcel.writeInt(this.A0Z ? 1 : 0);
        Boolean bool = this.A09;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        C41848B3p.A1K(parcel, this.A0C);
        parcel.writeInt(this.A0Y ? 1 : 0);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeString(this.A0E);
        parcel.writeStringList(this.A0M);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A0P ? 1 : 0);
        AnonymousClass7TG.A16(parcel, this.A0B, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A0A, 0, 1);
        parcel.writeParcelable(this.A06, i);
    }
}
