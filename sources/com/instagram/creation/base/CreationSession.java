package com.instagram.creation.base;

import X.0kD;
import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass36W;
import X.AnonymousClass514;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C41847B3o;
import X.JTO;
import X.JTS;
import X.LVP;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.location.intf.LocationSignalPackage;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.model.people.PeopleTag;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CreationSession implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(5);
    public float A00 = 1.0f;
    public int A01;
    public int A02;
    public Bitmap A03;
    public Rect A04;
    public AnonymousClass514 A05;
    public AnonymousClass514 A06;
    public MediaSession A07;
    public LocationSignalPackage A08;
    public MediaCaptureConfig A09;
    public AnonymousClass36W A0A;
    public PendingRecipient A0B;
    public String A0C;
    public String A0D;
    public List A0E = AnonymousClass7TE.A1C();
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public ArrayList A0N = AnonymousClass7TE.A1C();
    public final HashMap A0O = AnonymousClass7TE.A1E();
    public final HashMap A0P = AnonymousClass7TE.A1E();
    public final List A0Q = AnonymousClass7TE.A1C();
    public final Map A0R = AnonymousClass7TE.A1E();

    public final void A06() {
        this.A02 = -1;
        this.A03 = null;
        this.A04 = null;
        List list = this.A0E;
        list.clear();
        this.A07 = null;
        this.A0H = false;
        this.A0N.clear();
        this.A05 = this.A06;
        this.A01 = 0;
        this.A0I = false;
        this.A0D = null;
        list.clear();
        this.A07 = null;
        this.A0H = false;
        this.A0C = null;
        this.A00 = 0.0f;
        this.A0H = false;
    }

    public final void A07(String str, String str2, boolean z) {
        MediaSession photoSession;
        if (z) {
            0qQ.A0B(str, 0);
            photoSession = new VideoSession(str, str2);
        } else {
            0qQ.A0B(str, 0);
            photoSession = new PhotoSession(str, str2);
        }
        this.A0E.add(photoSession);
        this.A07 = photoSession;
        HashMap hashMap = this.A0O;
        if (!hashMap.isEmpty() && !hashMap.containsKey(str)) {
            this.A0H = true;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final PhotoSession A02() {
        MediaSession mediaSession;
        MediaSession mediaSession2 = this.A07;
        if (mediaSession2 == null) {
            return null;
        }
        if (mediaSession2.Bsu() == AnonymousClass05K.A01 && this.A0C != null) {
            Iterator it = this.A0E.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                mediaSession = (MediaSession) it.next();
                if (mediaSession.Bsu() == AnonymousClass05K.A00) {
                    break;
                }
            }
        }
        mediaSession = this.A07;
        if (mediaSession.Bsu() == AnonymousClass05K.A00) {
            return (PhotoSession) mediaSession;
        }
        return null;
    }

    public final PhotoSession A03(String str) {
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            MediaSession A0Z = JTO.A0Z(it);
            if (A0Z.Bsu() == AnonymousClass05K.A00 && str.equals(A0Z.B5g())) {
                return (PhotoSession) A0Z;
            }
        }
        return null;
    }

    public final VideoSession A04() {
        MediaSession mediaSession = this.A07;
        if (mediaSession == null || mediaSession.Bsu() != AnonymousClass05K.A01) {
            return null;
        }
        return (VideoSession) mediaSession;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        AnonymousClass36W r0 = this.A0A;
        r0.getClass();
        parcel.writeInt(r0.ordinal());
        parcel.writeParcelable(this.A09, i);
        parcel.writeInt(this.A02);
        parcel.writeTypedList(this.A0N);
        parcel.writeByte(this.A0K ? (byte) 1 : 0);
        AnonymousClass514 r02 = this.A05;
        if (r02 == null) {
            r02 = AnonymousClass514.SQUARE;
        }
        parcel.writeInt(r02.A01);
        AnonymousClass514 r03 = this.A06;
        r03.getClass();
        parcel.writeInt(r03.A01);
        parcel.writeInt(this.A01);
        List list = this.A0E;
        parcel.writeList(list);
        MediaSession mediaSession = this.A07;
        if (mediaSession != null) {
            i2 = list.indexOf(mediaSession);
        } else {
            i2 = -1;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.A0D);
        parcel.writeByte(this.A0I ? (byte) 1 : 0);
        parcel.writeString(this.A0C);
        parcel.writeFloat(this.A00);
        parcel.writeByte(this.A0M ? (byte) 1 : 0);
        parcel.writeByte(this.A0J ? (byte) 1 : 0);
        parcel.writeByte(this.A0F ? (byte) 1 : 0);
        parcel.writeByte(this.A0G ? (byte) 1 : 0);
        parcel.writeByte(this.A0L ? (byte) 1 : 0);
        HashMap hashMap = this.A0P;
        parcel.writeInt(hashMap.size());
        Iterator A0s = AnonymousClass7TF.A0s(hashMap);
        while (A0s.hasNext()) {
            parcel.writeString((String) JTS.A0f(parcel, A0s));
        }
        parcel.writeParcelable(this.A0B, i);
    }

    public CreationSession(Parcel parcel) {
        AnonymousClass514 r2;
        AnonymousClass514 r22;
        MediaSession mediaSession;
        this.A0A = AnonymousClass36W.values()[parcel.readInt()];
        this.A09 = (MediaCaptureConfig) C41847B3o.A03(parcel, MediaCaptureConfig.class);
        this.A02 = parcel.readInt();
        ArrayList createTypedArrayList = parcel.createTypedArrayList(PeopleTag.CREATOR);
        createTypedArrayList.getClass();
        this.A0N = createTypedArrayList;
        boolean z = true;
        this.A0K = AnonymousClass7TF.A1S(parcel.readByte(), 1);
        int readInt = parcel.readInt();
        AnonymousClass514[] r7 = AnonymousClass514.A05;
        int length = r7.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r2 = AnonymousClass514.SQUARE;
                break;
            }
            r2 = r7[i];
            if (r2.A01 == readInt) {
                break;
            }
            i++;
        }
        this.A05 = r2;
        int readInt2 = parcel.readInt();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                r22 = AnonymousClass514.SQUARE;
                break;
            }
            r22 = r7[i2];
            if (r22.A01 == readInt2) {
                break;
            }
            i2++;
        }
        this.A06 = r22;
        this.A01 = parcel.readInt();
        this.A0E = parcel.readArrayList(MediaSession.class.getClassLoader());
        int readInt3 = parcel.readInt();
        if (readInt3 != -1) {
            mediaSession = (MediaSession) this.A0E.get(readInt3);
        } else {
            mediaSession = null;
        }
        this.A07 = mediaSession;
        this.A0D = parcel.readString();
        this.A0I = AnonymousClass7TF.A1S(parcel.readByte(), 1);
        this.A0C = parcel.readString();
        this.A00 = parcel.readFloat();
        this.A0M = AnonymousClass7TF.A1S(parcel.readByte(), 1);
        this.A0J = AnonymousClass7TF.A1S(parcel.readByte(), 1);
        this.A0F = AnonymousClass7TF.A1S(parcel.readByte(), 1);
        this.A0G = AnonymousClass7TF.A1S(parcel.readByte(), 1);
        this.A0L = parcel.readByte() != 1 ? false : z;
        int readInt4 = parcel.readInt();
        for (int i3 = 0; i3 < readInt4; i3++) {
            this.A0P.put(parcel.readString(), parcel.readString());
        }
        this.A0B = (PendingRecipient) C41847B3o.A03(parcel, PendingRecipient.class);
    }

    public final int A00() {
        VideoSession A042;
        CropInfo cropInfo;
        PhotoSession A022 = A02();
        if ((A022 != null && (cropInfo = A022.A05) != null) || ((A042 = A04()) != null && (cropInfo = A042.A0C) != null)) {
            return cropInfo.A00;
        }
        0kD.A01("CreationSession_getOriginalHeight()", "Unable to get height");
        return 0;
    }

    public final int A01() {
        VideoSession A042;
        CropInfo cropInfo;
        PhotoSession A022 = A02();
        if ((A022 != null && (cropInfo = A022.A05) != null) || ((A042 = A04()) != null && (cropInfo = A042.A0C) != null)) {
            return cropInfo.A01;
        }
        0kD.A01("CreationSession_getOriginalWidth()", "Unable to get width");
        return 0;
    }

    public final List A05() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            MediaSession A0Z = JTO.A0Z(it);
            if (A0Z.Bsu() == AnonymousClass05K.A00) {
                A1C.add(A0Z);
            }
        }
        return Collections.unmodifiableList(A1C);
    }

    public CreationSession() {
        A06();
        this.A06 = AnonymousClass514.SQUARE;
    }
}
