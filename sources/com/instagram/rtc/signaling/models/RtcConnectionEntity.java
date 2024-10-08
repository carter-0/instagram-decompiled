package com.instagram.rtc.signaling.models;

import X.002;
import X.0qQ;
import X.ABF;
import X.ABH;
import X.AnonymousClass000;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C273654mx;
import X.C66579MXk;
import X.C69277Nid;
import X.C69278Nie;
import X.C69315NjG;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.video.common.events.IgRtcEventHeader;
import java.util.concurrent.TimeUnit;

public interface RtcConnectionEntity extends Parcelable {

    public final class EndCallConnectionEntity extends AnonymousClass0T0 implements RtcConnectionEntity {
        public static final Parcelable.Creator CREATOR = new W6F(13);
        public final C69277Nid A00;
        public final RtcIgNotification A01;
        public final C69315NjG A02;
        public final Integer A03;
        public final Integer A04;
        public final Integer A05;
        public final Long A06;
        public final String A07;
        public final String A08;
        public final String A09;
        public final String A0A;
        public final String A0B;
        public final String A0C;
        public final String A0D;
        public final String A0E;
        public final String A0F;
        public final boolean A0G;
        public final boolean A0H;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof EndCallConnectionEntity) {
                    EndCallConnectionEntity endCallConnectionEntity = (EndCallConnectionEntity) obj;
                    if (this.A02 != endCallConnectionEntity.A02 || !0qQ.A0K(this.A0C, endCallConnectionEntity.A0C) || this.A05 != endCallConnectionEntity.A05 || this.A03 != endCallConnectionEntity.A03 || !0qQ.A0K(this.A0B, endCallConnectionEntity.A0B) || !0qQ.A0K(this.A01, endCallConnectionEntity.A01) || !0qQ.A0K(this.A06, endCallConnectionEntity.A06) || !0qQ.A0K(this.A0D, endCallConnectionEntity.A0D) || !0qQ.A0K(this.A0E, endCallConnectionEntity.A0E) || !0qQ.A0K(this.A0F, endCallConnectionEntity.A0F) || !0qQ.A0K(this.A08, endCallConnectionEntity.A08) || !0qQ.A0K(this.A09, endCallConnectionEntity.A09) || !0qQ.A0K(this.A07, endCallConnectionEntity.A07) || !0qQ.A0K(this.A0A, endCallConnectionEntity.A0A) || this.A0H != endCallConnectionEntity.A0H || !0qQ.A0K(this.A04, endCallConnectionEntity.A04) || this.A00 != endCallConnectionEntity.A00 || this.A0G != endCallConnectionEntity.A0G) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            AnonymousClass7TE.A1T(parcel, this.A02);
            parcel.writeString(this.A0C);
            parcel.writeString(ABH.A01(this.A05));
            parcel.writeString(ABF.A01(this.A03));
            parcel.writeString(this.A0B);
            parcel.writeParcelable(this.A01, i);
            Long l = this.A06;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            parcel.writeString(this.A0D);
            parcel.writeString(this.A0E);
            parcel.writeString(this.A0F);
            parcel.writeString(this.A08);
            parcel.writeString(this.A09);
            parcel.writeString(this.A07);
            parcel.writeString(this.A0A);
            parcel.writeInt(this.A0H ? 1 : 0);
            AnonymousClass7TG.A16(parcel, this.A04, 0, 1);
            AnonymousClass7TE.A1T(parcel, this.A00);
            parcel.writeInt(this.A0G ? 1 : 0);
        }

        public final /* synthetic */ RtcCallKey AjW() {
            return new RtcCallKey(this.A0D);
        }

        public final String BWc() {
            return this.A0B;
        }

        public final Integer BWf() {
            return this.A03;
        }

        public final String BkA() {
            return this.A0C;
        }

        public final RtcIgNotification Bot() {
            return this.A01;
        }

        public final String Bse() {
            return this.A0D;
        }

        public final Integer BwQ() {
            return this.A05;
        }

        public final C69315NjG Bz4() {
            return this.A02;
        }

        public final String C6C() {
            return this.A0F;
        }

        public final Long C8z() {
            return this.A06;
        }

        public final String getTag() {
            return this.A0E;
        }

        public final int hashCode() {
            int A082 = AnonymousClass7TF.A08(this.A0C, AnonymousClass7TE.A0K(this.A02));
            Integer num = this.A05;
            int A0B2 = AnonymousClass7TG.A0B(num, ABH.A01(num), A082);
            Integer num2 = this.A03;
            int A083 = AnonymousClass7TF.A08(this.A0D, (((((AnonymousClass7TG.A0B(num2, ABF.A01(num2), A0B2) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31);
            boolean z = this.A0H;
            int A072 = AnonymousClass7TF.A07(this.A00, (AnonymousClass7TF.A09(z, (((((((((AnonymousClass7TF.A08(this.A0E, A083) + AnonymousClass7TG.A0E(this.A0F)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31);
            int i = 1237;
            if (this.A0G) {
                i = 1231;
            }
            return A072 + i;
        }

        public EndCallConnectionEntity(C69277Nid nid, RtcIgNotification rtcIgNotification, C69315NjG njG, Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2) {
            AnonymousClass7TG.A1O(njG, str);
            AnonymousClass7TF.A1G(str3, 8, str4);
            0qQ.A0B(nid, 17);
            this.A02 = njG;
            this.A0C = str;
            this.A05 = num;
            this.A03 = num2;
            this.A0B = str2;
            this.A01 = rtcIgNotification;
            this.A06 = l;
            this.A0D = str3;
            this.A0E = str4;
            this.A0F = str5;
            this.A08 = str6;
            this.A09 = str7;
            this.A07 = str8;
            this.A0A = str9;
            this.A0H = z;
            this.A04 = num3;
            this.A00 = nid;
            this.A0G = z2;
        }
    }

    public final class LiveInviteConnectionEntity extends AnonymousClass0T0 implements RtcConnectionEntity {
        public static final Parcelable.Creator CREATOR = new W6F(14);
        public final ImageUrl A00;
        public final RtcIgNotification A01;
        public final C69315NjG A02;
        public final Integer A03;
        public final Integer A04;
        public final Long A05;
        public final String A06;
        public final String A07;
        public final String A08;
        public final String A09;
        public final String A0A;
        public final String A0B;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof LiveInviteConnectionEntity) {
                    LiveInviteConnectionEntity liveInviteConnectionEntity = (LiveInviteConnectionEntity) obj;
                    if (this.A02 != liveInviteConnectionEntity.A02 || !0qQ.A0K(this.A08, liveInviteConnectionEntity.A08) || this.A04 != liveInviteConnectionEntity.A04 || this.A03 != liveInviteConnectionEntity.A03 || !0qQ.A0K(this.A07, liveInviteConnectionEntity.A07) || !0qQ.A0K(this.A01, liveInviteConnectionEntity.A01) || !0qQ.A0K(this.A05, liveInviteConnectionEntity.A05) || !0qQ.A0K(this.A09, liveInviteConnectionEntity.A09) || !0qQ.A0K(this.A0A, liveInviteConnectionEntity.A0A) || !0qQ.A0K(this.A0B, liveInviteConnectionEntity.A0B) || !0qQ.A0K(this.A06, liveInviteConnectionEntity.A06) || !0qQ.A0K(this.A00, liveInviteConnectionEntity.A00)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            AnonymousClass7TE.A1T(parcel, this.A02);
            parcel.writeString(this.A08);
            parcel.writeString(ABH.A01(this.A04));
            parcel.writeString(ABF.A01(this.A03));
            parcel.writeString(this.A07);
            parcel.writeParcelable(this.A01, i);
            AnonymousClass7TG.A15(parcel, this.A05);
            parcel.writeString(this.A09);
            parcel.writeString(this.A0A);
            parcel.writeString(this.A0B);
            parcel.writeString(this.A06);
            parcel.writeParcelable(this.A00, i);
        }

        public final /* synthetic */ RtcCallKey AjW() {
            return new RtcCallKey(this.A09);
        }

        public final String BWc() {
            return this.A07;
        }

        public final Integer BWf() {
            return this.A03;
        }

        public final String BkA() {
            return this.A08;
        }

        public final RtcIgNotification Bot() {
            return this.A01;
        }

        public final String Bse() {
            return this.A09;
        }

        public final Integer BwQ() {
            return this.A04;
        }

        public final C69315NjG Bz4() {
            return this.A02;
        }

        public final String C6C() {
            return this.A0B;
        }

        public final Long C8z() {
            return this.A05;
        }

        public final String getTag() {
            return this.A0A;
        }

        public final int hashCode() {
            int A082 = AnonymousClass7TF.A08(this.A08, AnonymousClass7TE.A0K(this.A02));
            Integer num = this.A04;
            int A0B2 = AnonymousClass7TG.A0B(num, ABH.A01(num), A082);
            Integer num2 = this.A03;
            int A083 = AnonymousClass7TF.A08(this.A09, (((((AnonymousClass7TG.A0B(num2, ABF.A01(num2), A0B2) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31);
            return AnonymousClass7TF.A08(this.A06, (AnonymousClass7TF.A08(this.A0A, A083) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TE.A0L(this.A00);
        }

        public LiveInviteConnectionEntity(ImageUrl imageUrl, RtcIgNotification rtcIgNotification, C69315NjG njG, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5, String str6) {
            AnonymousClass7TG.A1O(njG, str);
            AnonymousClass7TF.A1G(str3, 8, str4);
            0qQ.A0B(str6, 11);
            this.A02 = njG;
            this.A08 = str;
            this.A04 = num;
            this.A03 = num2;
            this.A07 = str2;
            this.A01 = rtcIgNotification;
            this.A05 = l;
            this.A09 = str3;
            this.A0A = str4;
            this.A0B = str5;
            this.A06 = str6;
            this.A00 = imageUrl;
        }
    }

    public final class RtcCallConnectionEntity extends AnonymousClass0T0 implements RtcConnectionEntity {
        public static final Parcelable.Creator CREATOR = new W6F(15);
        public final long A00 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        public final C69277Nid A01;
        public final C69278Nie A02;
        public final RtcCallKey A03;
        public final RtcIgNotification A04;
        public final C69315NjG A05;
        public final IgRtcEventHeader A06;
        public final Integer A07;
        public final Integer A08;
        public final Long A09;
        public final String A0A;
        public final String A0B;
        public final String A0C;
        public final String A0D;
        public final String A0E;
        public final String A0F;
        public final String A0G;
        public final String A0H;
        public final String A0I;
        public final String A0J;
        public final String A0K;
        public final boolean A0L;
        public final boolean A0M;
        public final boolean A0N;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof RtcCallConnectionEntity) {
                    RtcCallConnectionEntity rtcCallConnectionEntity = (RtcCallConnectionEntity) obj;
                    if (this.A05 != rtcCallConnectionEntity.A05 || !0qQ.A0K(this.A0G, rtcCallConnectionEntity.A0G) || this.A08 != rtcCallConnectionEntity.A08 || this.A07 != rtcCallConnectionEntity.A07 || !0qQ.A0K(this.A0F, rtcCallConnectionEntity.A0F) || !0qQ.A0K(this.A04, rtcCallConnectionEntity.A04) || !0qQ.A0K(this.A09, rtcCallConnectionEntity.A09) || !0qQ.A0K(this.A0H, rtcCallConnectionEntity.A0H) || !0qQ.A0K(this.A0I, rtcCallConnectionEntity.A0I) || !0qQ.A0K(this.A0J, rtcCallConnectionEntity.A0J) || !0qQ.A0K(this.A0K, rtcCallConnectionEntity.A0K) || !0qQ.A0K(this.A0B, rtcCallConnectionEntity.A0B) || !0qQ.A0K(this.A0C, rtcCallConnectionEntity.A0C) || !0qQ.A0K(this.A0A, rtcCallConnectionEntity.A0A) || !0qQ.A0K(this.A0D, rtcCallConnectionEntity.A0D) || !0qQ.A0K(this.A0E, rtcCallConnectionEntity.A0E) || this.A01 != rtcCallConnectionEntity.A01 || this.A0M != rtcCallConnectionEntity.A0M || this.A02 != rtcCallConnectionEntity.A02 || this.A0L != rtcCallConnectionEntity.A0L || this.A0N != rtcCallConnectionEntity.A0N || !0qQ.A0K(this.A06, rtcCallConnectionEntity.A06) || !0qQ.A0K(this.A03, rtcCallConnectionEntity.A03)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            AnonymousClass7TE.A1T(parcel, this.A05);
            parcel.writeString(this.A0G);
            parcel.writeString(ABH.A01(this.A08));
            parcel.writeString(ABF.A01(this.A07));
            parcel.writeString(this.A0F);
            parcel.writeParcelable(this.A04, i);
            AnonymousClass7TG.A15(parcel, this.A09);
            parcel.writeString(this.A0H);
            parcel.writeString(this.A0I);
            parcel.writeString(this.A0J);
            parcel.writeString(this.A0K);
            parcel.writeString(this.A0B);
            parcel.writeString(this.A0C);
            parcel.writeString(this.A0A);
            parcel.writeString(this.A0D);
            parcel.writeString(this.A0E);
            AnonymousClass7TE.A1T(parcel, this.A01);
            parcel.writeInt(this.A0M ? 1 : 0);
            AnonymousClass7TE.A1T(parcel, this.A02);
            parcel.writeInt(this.A0L ? 1 : 0);
            parcel.writeInt(this.A0N ? 1 : 0);
            parcel.writeParcelable(this.A06, i);
            parcel.writeParcelable(this.A03, i);
        }

        public final String A00() {
            if (this.A01 == C69277Nid.NO_E2EE || this.A0M) {
                return this.A0J;
            }
            return this.A0E;
        }

        public final RtcCallKey AjW() {
            return this.A03;
        }

        public final String BWc() {
            return this.A0F;
        }

        public final Integer BWf() {
            return this.A07;
        }

        public final String BkA() {
            return this.A0G;
        }

        public final RtcIgNotification Bot() {
            return this.A04;
        }

        public final String Bse() {
            return this.A0H;
        }

        public final Integer BwQ() {
            return this.A08;
        }

        public final C69315NjG Bz4() {
            return this.A05;
        }

        public final String C6C() {
            return this.A0J;
        }

        public final Long C8z() {
            return this.A09;
        }

        public final String getTag() {
            return this.A0I;
        }

        public final int hashCode() {
            int A082 = AnonymousClass7TF.A08(this.A0G, AnonymousClass7TE.A0K(this.A05));
            Integer num = this.A08;
            int A0B2 = AnonymousClass7TG.A0B(num, ABH.A01(num), A082);
            Integer num2 = this.A07;
            int A083 = AnonymousClass7TF.A08(this.A0H, (((((AnonymousClass7TG.A0B(num2, ABF.A01(num2), A0B2) + AnonymousClass7TG.A0E(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31);
            String str = this.A0B;
            int A092 = AnonymousClass7TF.A09(this.A0L, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A09(this.A0M, AnonymousClass7TF.A07(this.A01, (((((((AnonymousClass7TF.A08(str, (((AnonymousClass7TF.A08(this.A0I, A083) + AnonymousClass7TG.A0E(this.A0J)) * 31) + AnonymousClass7TG.A0E(this.A0K)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0E(this.A0E)) * 31))));
            return AnonymousClass7TE.A0N(this.A03, (AnonymousClass7TF.A09(this.A0N, A092) + AnonymousClass7TE.A0L(this.A06)) * 31);
        }

        public RtcCallConnectionEntity(C69277Nid nid, C69278Nie nie, RtcCallKey rtcCallKey, RtcIgNotification rtcIgNotification, C69315NjG njG, IgRtcEventHeader igRtcEventHeader, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, boolean z3) {
            AnonymousClass7TG.A1O(njG, str);
            String str12 = str4;
            AnonymousClass7TF.A1G(str3, 8, str12);
            String str13 = str7;
            0qQ.A0B(str13, 12);
            0qQ.A0B(nid, 17);
            0qQ.A0B(nie, 19);
            0qQ.A0B(rtcCallKey, 23);
            this.A05 = njG;
            this.A0G = str;
            this.A08 = num;
            this.A07 = num2;
            this.A0F = str2;
            this.A04 = rtcIgNotification;
            this.A09 = l;
            this.A0H = str3;
            this.A0I = str12;
            this.A0J = str5;
            this.A0K = str6;
            this.A0B = str13;
            this.A0C = str8;
            this.A0A = str9;
            this.A0D = str10;
            this.A0E = str11;
            this.A01 = nid;
            this.A0M = z;
            this.A02 = nie;
            this.A0L = z2;
            this.A0N = z3;
            this.A06 = igRtcEventHeader;
            this.A03 = rtcCallKey;
        }

        public final String toString() {
            String str;
            String str2;
            String str3;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("RtcCallConnectionEntity(state=");
            A1A.append(this.A05);
            A1A.append(C66579MXk.A00(442));
            A1A.append(this.A0G);
            A1A.append(", signalingProtocol=");
            Integer num = this.A08;
            if (num != null) {
                str = ABH.A01(num);
            } else {
                str = "null";
            }
            A1A.append(str);
            A1A.append(C273654mx.A00(1109));
            Integer num2 = this.A07;
            if (num2 != null) {
                switch (num2.intValue()) {
                    case 1:
                        str3 = "mqtt";
                        break;
                    case 2:
                        str3 = NetInfoModule.CONNECTION_TYPE_NONE;
                        break;
                    default:
                        str3 = "normal";
                        break;
                }
                str2 = 002.A0R("call notification push type: ", str3);
            } else {
                str2 = "null";
            }
            A1A.append(str2);
            A1A.append(", notificationMessage=");
            A1A.append(this.A0F);
            A1A.append(", rtcIgNotification=");
            A1A.append(this.A04);
            A1A.append(", traceId=");
            A1A.append(this.A09);
            A1A.append(AnonymousClass000.A00(2046));
            A1A.append(this.A0H);
            A1A.append(", tag=");
            A1A.append(this.A0I);
            A1A.append(C66579MXk.A00(49));
            A1A.append(this.A0J);
            A1A.append(AnonymousClass000.A00(2050));
            A1A.append(this.A0K);
            A1A.append(", callerId=");
            A1A.append(this.A0B);
            A1A.append(", callerName=");
            A1A.append(this.A0C);
            A1A.append(C66579MXk.A00(423));
            A1A.append(this.A0A);
            A1A.append(", displayUri=");
            A1A.append(this.A0D);
            A1A.append(", msgrThreadId=");
            A1A.append(this.A0E);
            A1A.append(C66579MXk.A00(428));
            A1A.append(this.A01);
            A1A.append(", isE2eeOverInstamadillo=");
            A1A.append(this.A0M);
            A1A.append(C66579MXk.A00(429));
            A1A.append(this.A02);
            A1A.append(C66579MXk.A00(433));
            A1A.append(this.A0L);
            A1A.append(C66579MXk.A00(434));
            A1A.append(this.A0N);
            A1A.append(", rtcMessageEventHeader=");
            A1A.append(this.A06);
            A1A.append(", callKey=");
            return AnonymousClass7TG.A0n(this.A03, A1A);
        }
    }

    public final class RtcCallGenericConnectionEntity extends AnonymousClass0T0 implements RtcConnectionEntity {
        public static final Parcelable.Creator CREATOR = new W6F(16);
        public final RtcIgNotification A00;
        public final C69315NjG A01;
        public final Integer A02;
        public final Integer A03;
        public final Long A04;
        public final String A05;
        public final String A06;
        public final String A07;
        public final String A08;
        public final String A09;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof RtcCallGenericConnectionEntity) {
                    RtcCallGenericConnectionEntity rtcCallGenericConnectionEntity = (RtcCallGenericConnectionEntity) obj;
                    if (this.A01 != rtcCallGenericConnectionEntity.A01 || !0qQ.A0K(this.A06, rtcCallGenericConnectionEntity.A06) || this.A03 != rtcCallGenericConnectionEntity.A03 || this.A02 != rtcCallGenericConnectionEntity.A02 || !0qQ.A0K(this.A05, rtcCallGenericConnectionEntity.A05) || !0qQ.A0K(this.A00, rtcCallGenericConnectionEntity.A00) || !0qQ.A0K(this.A04, rtcCallGenericConnectionEntity.A04) || !0qQ.A0K(this.A07, rtcCallGenericConnectionEntity.A07) || !0qQ.A0K(this.A08, rtcCallGenericConnectionEntity.A08) || !0qQ.A0K(this.A09, rtcCallGenericConnectionEntity.A09)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            AnonymousClass7TE.A1T(parcel, this.A01);
            parcel.writeString(this.A06);
            parcel.writeString(ABH.A01(this.A03));
            parcel.writeString(ABF.A01(this.A02));
            parcel.writeString(this.A05);
            parcel.writeParcelable(this.A00, i);
            AnonymousClass7TG.A15(parcel, this.A04);
            parcel.writeString(this.A07);
            parcel.writeString(this.A08);
            parcel.writeString(this.A09);
        }

        public final /* synthetic */ RtcCallKey AjW() {
            return new RtcCallKey(this.A07);
        }

        public final String BWc() {
            return this.A05;
        }

        public final Integer BWf() {
            return this.A02;
        }

        public final String BkA() {
            return this.A06;
        }

        public final RtcIgNotification Bot() {
            return this.A00;
        }

        public final String Bse() {
            return this.A07;
        }

        public final Integer BwQ() {
            return this.A03;
        }

        public final C69315NjG Bz4() {
            return this.A01;
        }

        public final String C6C() {
            return this.A09;
        }

        public final Long C8z() {
            return this.A04;
        }

        public final String getTag() {
            return this.A08;
        }

        public final int hashCode() {
            int A082 = AnonymousClass7TF.A08(this.A06, AnonymousClass7TE.A0K(this.A01));
            Integer num = this.A03;
            int A0B = AnonymousClass7TG.A0B(num, ABH.A01(num), A082);
            Integer num2 = this.A02;
            int A0B2 = AnonymousClass7TG.A0B(num2, ABF.A01(num2), A0B);
            int i = 0;
            int A083 = AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A08(this.A07, (((((A0B2 + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31));
            String str = this.A09;
            if (str != null) {
                i = str.hashCode();
            }
            return A083 + i;
        }

        public RtcCallGenericConnectionEntity(RtcIgNotification rtcIgNotification, C69315NjG njG, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5) {
            AnonymousClass7TG.A1O(njG, str);
            AnonymousClass7TF.A1G(str3, 8, str4);
            this.A01 = njG;
            this.A06 = str;
            this.A03 = num;
            this.A02 = num2;
            this.A05 = str2;
            this.A00 = rtcIgNotification;
            this.A04 = l;
            this.A07 = str3;
            this.A08 = str4;
            this.A09 = str5;
        }
    }

    RtcCallKey AjW();

    String BWc();

    Integer BWf();

    String BkA();

    RtcIgNotification Bot();

    String Bse();

    Integer BwQ();

    C69315NjG Bz4();

    String C6C();

    Long C8z();

    String getTag();
}
