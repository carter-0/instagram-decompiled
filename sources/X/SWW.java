package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebookpay.incentives.model.FeaturedIncentiveDetails;
import com.facebookpay.incentives.model.IncentiveCredentialList;
import com.facebookpay.incentives.model.IncentiveList;
import com.facebookpay.logging.ClientSuppressionPolicy;
import com.facebookpay.logging.FBPayLoggerData;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.logging.LoggingPolicy;
import com.facebookpay.msc.logging.LoggingData;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.otc.models.OtcOptionState;
import com.facebookpay.paymentmethod.model.APMCredential;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PayPalCredential;
import com.facebookpay.paymentmethod.model.TokenizedCard;
import com.facebookpay.paypal.model.LinkableTextParams;
import com.facebookpay.paypal.model.PaypalConsentLaunchParams;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.fbpay.hub.common.link.LinkParams;
import com.fbpay.hub.contactinfo.address.api.FBPayAddress;
import com.fbpay.hub.form.params.FormDialogParams;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.fbpay.hub.merchantinfo.api.MerchantInfo;
import com.fbpay.hub.orders.api.FBPayOrder;
import com.fbpay.hub.paymentmethods.api.FbPayAdditionalField;
import com.fbpay.hub.paymentmethods.api.FbPayBankAccount;
import com.fbpay.hub.paymentmethods.api.FbPayCreditCard;
import com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption;
import com.fbpay.hub.paymentmethods.api.FbPayNewPayPalOption;
import com.fbpay.hub.paymentmethods.api.FbPayPayPal;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentDefaultInfo;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod;
import com.fbpay.hub.paymentmethods.api.FbPayShopPay;
import com.fbpay.hub.riskenforcement.api.FBPayHubRiskEnforcementData;
import com.fbpay.hub.transactions.api.UpcomingPayout;
import com.fbpay.theme.FBPayIcon;
import com.fbpay.util.tooltip.TooltipInfo;
import com.fbpay.w3c.Address;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.Contact;
import com.fbpay.w3c.Email;
import com.fbpay.w3c.Phone;
import com.fbpay.w3c.W3CCardDetail;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import com.google.android.exoplayer2.metadata.vr.CameraMotionData;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import org.webrtc.EglBase14Impl;

public final class SWW implements Parcelable.Creator {
    public final int A00;

    public SWW(int i) {
        this.A00 = i;
    }

    public static SWW A00(int i) {
        return new SWW(i);
    }

    /* JADX WARNING: type inference failed for: r7v78, types: [android.view.ViewGroup$MarginLayoutParams, com.google.android.flexbox.FlexboxLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r7v79, types: [X.3MX, com.google.android.flexbox.FlexboxLayoutManager$LayoutParams] */
    /* JADX WARNING: type inference failed for: r7v80, types: [com.google.android.flexbox.FlexboxLayoutManager$SavedState, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C21263XRi valueOf;
        Object createFromParcel;
        Object createFromParcel2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        Parcel parcel2 = parcel;
        switch (this.A00) {
            case 0:
                0qQ.A0B(parcel2, 0);
                return new FeaturedIncentiveDetails((C7X) Pxi.A0U(parcel2, FeaturedIncentiveDetails.class), parcel2.readString());
            case 1:
                0qQ.A0B(parcel2, 0);
                return new IncentiveCredentialList(parcel2.createStringArrayList());
            case 2:
                int A002 = C41848B3p.A00(parcel2);
                ArrayList A0v = DbS.A0v(A002);
                for (int i2 = 0; i2 != A002; i2++) {
                    C41848B3p.A1J(parcel2, IncentiveList.class, A0v);
                }
                return new IncentiveList(A0v);
            case 3:
                String A1D = C41848B3p.A1D(parcel2);
                if (parcel2.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = C21263XRi.valueOf(parcel2.readString());
                }
                return new ClientSuppressionPolicy(C8933RGb.valueOf(parcel2.readString()), valueOf, A1D);
            case 4:
                return new FBPayLoggerData(parcel2);
            case 5:
                String A1D2 = C41848B3p.A1D(parcel2);
                long readLong = parcel2.readLong();
                if (parcel2.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = LoggingPolicy.CREATOR.createFromParcel(parcel2);
                }
                LoggingPolicy loggingPolicy = (LoggingPolicy) createFromParcel;
                int readInt = parcel2.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i3 = 0; i3 != readInt; i3++) {
                    linkedHashSet.add(parcel2.readString());
                }
                int readInt2 = parcel2.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
                for (int i4 = 0; i4 != readInt2; i4++) {
                    linkedHashSet2.add(parcel2.readString());
                }
                return new LoggingContext(loggingPolicy, A1D2, linkedHashSet, linkedHashSet2, readLong, C41848B3p.A1X(parcel2));
            case 6:
                String A1D3 = C41848B3p.A1D(parcel2);
                int readInt3 = parcel2.readInt();
                ArrayList A0v2 = DbS.A0v(readInt3);
                for (int i5 = 0; i5 != readInt3; i5 = JTT.A04(parcel2, ClientSuppressionPolicy.CREATOR, A0v2, i5)) {
                }
                return new LoggingPolicy(A1D3, A0v2);
            case 7:
                return new LoggingData(C41848B3p.A1D(parcel2));
            case 8:
                return new OtcInput(C41848B3p.A1D(parcel2), parcel2.readString());
            case 9:
                String A1D4 = C41848B3p.A1D(parcel2);
                int readInt4 = parcel2.readInt();
                LinkedHashMap A0x = DbS.A0x(readInt4);
                int i6 = 0;
                while (true) {
                    String readString = parcel2.readString();
                    if (i6 == readInt4) {
                        return new OtcOptionState(RED.valueOf(readString), A1D4, parcel2.readString(), A0x);
                    }
                    A0x.put(C298525tb.valueOf(readString), RED.valueOf(parcel2.readString()));
                    i6++;
                }
            case 10:
                0qQ.A0B(parcel2, 0);
                return new APMCredential((QR8) Pxi.A0U(parcel2, APMCredential.class), C21267XRm.valueOf(parcel2.readString()), C41848B3p.A1X(parcel2));
            case 11:
                0qQ.A0B(parcel2, 0);
                C7648QRp qRp = (C7648QRp) Pxi.A0U(parcel2, CreditCard.class);
                boolean z = true;
                boolean A1P = AnonymousClass7TF.A1P(parcel2.readInt());
                if (parcel2.readInt() == 0) {
                    z = false;
                }
                return new CreditCard(qRp, A1P, z);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                0qQ.A0B(parcel2, 0);
                return new PayPalCredential((QVD) Pxi.A0U(parcel2, PayPalCredential.class), parcel2.readString(), C41848B3p.A1X(parcel2));
            case 13:
                0qQ.A0B(parcel2, 0);
                Class<TokenizedCard> cls = TokenizedCard.class;
                C7648QRp qRp2 = (C7648QRp) Pxi.A0U(parcel2, cls);
                C7742QVf qVf = (C7742QVf) Pxi.A0U(parcel2, cls);
                boolean z2 = true;
                boolean A1P2 = AnonymousClass7TF.A1P(parcel2.readInt());
                if (parcel2.readInt() == 0) {
                    z2 = false;
                }
                return new TokenizedCard(qRp2, qVf, A1P2, z2);
            case 14:
                return new LinkableTextParams(C41848B3p.A1D(parcel2), parcel2.readInt(), parcel2.readInt(), parcel2.readString());
            case 15:
                String A1D5 = C41848B3p.A1D(parcel2);
                String readString2 = parcel2.readString();
                String readString3 = parcel2.readString();
                LoggingPolicy loggingPolicy2 = (LoggingPolicy) C41847B3o.A03(parcel2, PaypalConsentLaunchParams.class);
                String readString4 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    createFromParcel2 = null;
                } else {
                    createFromParcel2 = LinkableTextParams.CREATOR.createFromParcel(parcel2);
                }
                return new PaypalConsentLaunchParams(loggingPolicy2, (LinkableTextParams) createFromParcel2, A1D5, readString2, readString3, readString4, parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), C41848B3p.A1X(parcel2));
            case 16:
                return new ShippingAddress(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), C41848B3p.A1X(parcel2), C41848B3p.A1X(parcel2), C41848B3p.A1X(parcel2), C41848B3p.A1X(parcel2), C41848B3p.A1X(parcel2));
            case 17:
                return new LinkParams(parcel2);
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return new FBPayAddress(parcel2);
            case 19:
                return new FormDialogParams(parcel2);
            case 20:
                return new FormLogEvents(parcel2);
            case 21:
                return new FormParams(parcel2);
            case 22:
                return new MerchantInfo(parcel2);
            case 23:
                return new FBPayOrder(parcel2);
            case 24:
                return new FbPayAdditionalField(parcel2);
            case 25:
                return new FbPayBankAccount(parcel2);
            case 26:
                return new FbPayCreditCard(parcel2);
            case 27:
                return new FbPayNewCreditCardOption(parcel2);
            case 28:
                return new FbPayNewPayPalOption(parcel2);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new FbPayPayPal(parcel2);
            case 30:
                return new FbPayPaymentDefaultInfo(parcel2);
            case 31:
                return new FbPayPaymentMethod(parcel2);
            case 32:
                return new FbPayShopPay(parcel2);
            case 33:
                return new FBPayHubRiskEnforcementData(parcel2);
            case 34:
                return new UpcomingPayout(parcel2);
            case 35:
                return FBPayIcon.valueOf(C41848B3p.A1D(parcel2));
            case 36:
                return new TooltipInfo(C41848B3p.A00(parcel2), parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), parcel2.readInt());
            case 37:
                return new Address(parcel2);
            case 38:
                return new CardDetails(parcel2);
            case 39:
                return new Contact(parcel2);
            case 40:
                return new Email(parcel2);
            case Seq.NULL_REFNUM /*41*/:
                return new Phone(parcel2);
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new W3CCardDetail(parcel2);
            case 43:
                return new DrmInitData(parcel2);
            case 44:
                return new DrmInitData.SchemeData(parcel2);
            case 45:
                String readString5 = parcel2.readString();
                readString5.getClass();
                return new AppInfoTable(parcel2.readInt(), readString5);
            case 46:
                return new EventMessage(parcel2);
            case 47:
                return new PictureFrame(parcel2);
            case 48:
                return new VorbisComment(parcel2);
            case 49:
                return new IcyHeaders(parcel2);
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new IcyInfo(parcel2);
            case 51:
                return new ApicFrame(parcel2);
            case 52:
                return new BinaryFrame(parcel2);
            case 53:
                return new ChapterFrame(parcel2);
            case 54:
                return new ChapterTocFrame(parcel2);
            case 55:
                return new CommentFrame(parcel2);
            case 56:
                return new GeobFrame(parcel2);
            case 57:
                return new InternalFrame(parcel2);
            case 58:
                return new MlltFrame(parcel2);
            case 59:
                return new PrivFrame(parcel2);
            case 60:
                String readString6 = parcel2.readString();
                readString6.getClass();
                String readString7 = parcel2.readString();
                String[] createStringArray = parcel2.createStringArray();
                createStringArray.getClass();
                Object[] copyOf = Arrays.copyOf(createStringArray, createStringArray.length);
                return new TextInformationFrame(readString6, readString7, AnonymousClass7TE.A1D(0sr.A1P(Arrays.copyOf(copyOf, copyOf.length))));
            case 61:
                return new UrlLinkFrame(parcel2);
            case 62:
                return new MdtaMetadataEntry(parcel2);
            case 63:
                return new MotionPhotoMetadata(parcel2);
            case 64:
                ArrayList A1C = AnonymousClass7TE.A1C();
                Pxe.A1O(parcel2, SlowMotionData.Segment.class, A1C);
                return new SlowMotionData(A1C);
            case 65:
                return new SlowMotionData.Segment(parcel2.readLong(), parcel2.readLong(), parcel2.readInt());
            case 66:
                return new SmtaMetadataEntry(parcel2);
            case 67:
                return new PrivateCommand(parcel2);
            case 68:
                return new SpliceInsertCommand(parcel2);
            case 69:
                return new Object();
            case 70:
                return new SpliceScheduleCommand(parcel2);
            case 71:
                return new TimeSignalCommand(parcel2.readLong(), parcel2.readLong());
            case 72:
                return new VorbisComment(parcel2);
            case 73:
                return new CameraMotionData(parcel2);
            case 74:
                return new DownloadRequest(parcel2);
            case 75:
                return new StreamKey(parcel2);
            case 76:
                return new Requirements(parcel2.readInt());
            case 77:
                boolean z3 = false;
                ? marginLayoutParams2 = new ViewGroup.MarginLayoutParams(0, 0);
                marginLayoutParams2.A08 = 1;
                marginLayoutParams2.A02 = 1.0f;
                marginLayoutParams2.A03 = -1;
                marginLayoutParams2.A00 = -1.0f;
                marginLayoutParams2.A05 = 16777215;
                marginLayoutParams2.A04 = 16777215;
                marginLayoutParams2.A08 = parcel2.readInt();
                marginLayoutParams2.A01 = parcel2.readFloat();
                marginLayoutParams2.A02 = parcel2.readFloat();
                marginLayoutParams2.A03 = parcel2.readInt();
                marginLayoutParams2.A00 = parcel2.readFloat();
                marginLayoutParams2.A07 = parcel2.readInt();
                marginLayoutParams2.A06 = parcel2.readInt();
                marginLayoutParams2.A05 = parcel2.readInt();
                marginLayoutParams2.A04 = parcel2.readInt();
                if (parcel2.readByte() != 0) {
                    z3 = true;
                }
                marginLayoutParams2.A09 = z3;
                marginLayoutParams = marginLayoutParams2;
                break;
            case 78:
                ? r7 = new AnonymousClass3MX(-2, -2);
                r7.A01 = 0.0f;
                r7.A02 = 1.0f;
                r7.A03 = -1;
                r7.A00 = -1.0f;
                r7.A05 = 16777215;
                r7.A04 = 16777215;
                r7.A01 = parcel2.readFloat();
                r7.A02 = parcel2.readFloat();
                r7.A03 = parcel2.readInt();
                r7.A00 = parcel2.readFloat();
                r7.A07 = parcel2.readInt();
                r7.A06 = parcel2.readInt();
                r7.A05 = parcel2.readInt();
                r7.A04 = parcel2.readInt();
                r7.A08 = AnonymousClass7TF.A1P(parcel2.readByte());
                marginLayoutParams = r7;
                break;
            case 79:
                ? obj = new Object();
                obj.A01 = parcel2.readInt();
                obj.A00 = parcel2.readInt();
                return obj;
            case 80:
                int A003 = C295505oK.A00(parcel2);
                HashSet A1F = AnonymousClass7TE.A1F();
                ArrayList arrayList = null;
                zzs zzs = null;
                int i7 = 0;
                int i8 = 0;
                while (parcel2.dataPosition() < A003) {
                    int readInt5 = parcel2.readInt();
                    char c = (char) readInt5;
                    int i9 = 1;
                    if (c != 1) {
                        i9 = 2;
                        if (c != 2) {
                            i9 = 3;
                            if (c != 3) {
                                i9 = 4;
                                if (c != 4) {
                                    C295505oK.A0C(parcel2, readInt5);
                                } else {
                                    zzs = (zzs) C295505oK.A04(parcel2, zzs.CREATOR, readInt5);
                                }
                            } else {
                                i8 = Pxh.A08(parcel2, readInt5);
                            }
                        } else {
                            arrayList = C295505oK.A0A(parcel2, zzu.CREATOR, readInt5);
                        }
                    } else {
                        i7 = Pxh.A08(parcel2, readInt5);
                    }
                    AnonymousClass7TF.A1M(A1F, i9);
                }
                if (parcel2.dataPosition() == A003) {
                    return new zzo(zzs, arrayList, A1F, i7, i8);
                }
                throw new TQZ(parcel2, 002.A0O("Overread allowed size end=", A003));
            case 81:
                int A004 = C295505oK.A00(parcel2);
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                int i10 = 0;
                while (parcel2.dataPosition() < A004) {
                    int readInt6 = parcel2.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i10 = Pxh.A08(parcel2, readInt6);
                            break;
                        case 2:
                            arrayList2 = C295505oK.A09(parcel2, readInt6);
                            break;
                        case 3:
                            arrayList3 = C295505oK.A09(parcel2, readInt6);
                            break;
                        case 4:
                            arrayList4 = C295505oK.A09(parcel2, readInt6);
                            break;
                        case 5:
                            arrayList5 = C295505oK.A09(parcel2, readInt6);
                            break;
                        case 6:
                            arrayList6 = C295505oK.A09(parcel2, readInt6);
                            break;
                        default:
                            C295505oK.A0C(parcel2, readInt6);
                            break;
                    }
                }
                C295505oK.A0B(parcel2, A004);
                return new zzs(arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, i10);
            case 82:
                int A005 = C295505oK.A00(parcel2);
                HashSet A1F2 = AnonymousClass7TE.A1F();
                zzw zzw = null;
                int i11 = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                while (parcel2.dataPosition() < A005) {
                    int readInt7 = parcel2.readInt();
                    char c2 = (char) readInt7;
                    int i12 = 1;
                    if (c2 != 1) {
                        i12 = 2;
                        if (c2 != 2) {
                            i12 = 3;
                            if (c2 != 3) {
                                i12 = 4;
                                if (c2 != 4) {
                                    i12 = 5;
                                    if (c2 != 5) {
                                        C295505oK.A0C(parcel2, readInt7);
                                    } else {
                                        str3 = C295505oK.A08(parcel2, readInt7);
                                    }
                                } else {
                                    str2 = C295505oK.A08(parcel2, readInt7);
                                }
                            } else {
                                str = C295505oK.A08(parcel2, readInt7);
                            }
                        } else {
                            zzw = (zzw) C295505oK.A04(parcel2, zzw.CREATOR, readInt7);
                        }
                    } else {
                        i11 = Pxh.A08(parcel2, readInt7);
                    }
                    AnonymousClass7TF.A1M(A1F2, i12);
                }
                if (parcel2.dataPosition() == A005) {
                    return new zzu(zzw, str, str2, str3, A1F2, i11);
                }
                throw new TQZ(parcel2, 002.A0O("Overread allowed size end=", A005));
            case 83:
                int A006 = C295505oK.A00(parcel2);
                HashSet A1F3 = AnonymousClass7TE.A1F();
                String str4 = null;
                byte[] bArr = null;
                PendingIntent pendingIntent = null;
                DeviceMetaData deviceMetaData = null;
                int i13 = 0;
                int i14 = 0;
                while (parcel2.dataPosition() < A006) {
                    int readInt8 = parcel2.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i13 = Pxh.A08(parcel2, readInt8);
                            i = 1;
                            break;
                        case 2:
                            str4 = C295505oK.A08(parcel2, readInt8);
                            i = 2;
                            break;
                        case 3:
                            i14 = Pxh.A08(parcel2, readInt8);
                            i = 3;
                            break;
                        case 4:
                            bArr = C295505oK.A0H(parcel2, readInt8);
                            i = 4;
                            break;
                        case 5:
                            pendingIntent = (PendingIntent) C295505oK.A04(parcel2, PendingIntent.CREATOR, readInt8);
                            i = 5;
                            break;
                        case 6:
                            deviceMetaData = (DeviceMetaData) C295505oK.A04(parcel2, DeviceMetaData.CREATOR, readInt8);
                            i = 6;
                            break;
                        default:
                            C295505oK.A0C(parcel2, readInt8);
                            continue;
                    }
                    AnonymousClass7TF.A1M(A1F3, i);
                }
                if (parcel2.dataPosition() == A006) {
                    return new zzw(pendingIntent, deviceMetaData, str4, A1F3, bArr, i13, i14);
                }
                throw new TQZ(parcel2, 002.A0O("Overread allowed size end=", A006));
            case 84:
                int A007 = C295505oK.A00(parcel2);
                long j = 0;
                int i15 = 0;
                boolean z4 = false;
                boolean z5 = false;
                while (parcel2.dataPosition() < A007) {
                    int readInt9 = parcel2.readInt();
                    char c3 = (char) readInt9;
                    if (c3 == 1) {
                        i15 = Pxh.A08(parcel2, readInt9);
                    } else if (c3 == 2) {
                        z4 = C295505oK.A0G(parcel2, readInt9);
                    } else if (c3 == 3) {
                        j = Pxi.A08(parcel2, readInt9);
                    } else if (c3 != 4) {
                        C295505oK.A0C(parcel2, readInt9);
                    } else {
                        z5 = C295505oK.A0G(parcel2, readInt9);
                    }
                }
                C295505oK.A0B(parcel2, A007);
                return new DeviceMetaData(i15, j, z4, z5);
            case 85:
                int A008 = C295505oK.A00(parcel2);
                String str5 = null;
                String str6 = null;
                Uri uri = null;
                ArrayList arrayList7 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                while (parcel2.dataPosition() < A008) {
                    int readInt10 = parcel2.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            str5 = C295505oK.A08(parcel2, readInt10);
                            break;
                        case 2:
                            str6 = C295505oK.A08(parcel2, readInt10);
                            break;
                        case 3:
                            uri = (Uri) C295505oK.A04(parcel2, Uri.CREATOR, readInt10);
                            break;
                        case 4:
                            arrayList7 = C295505oK.A0A(parcel2, IdToken.CREATOR, readInt10);
                            break;
                        case 5:
                            str7 = C295505oK.A08(parcel2, readInt10);
                            break;
                        case 6:
                            str8 = C295505oK.A08(parcel2, readInt10);
                            break;
                        case 9:
                            str9 = C295505oK.A08(parcel2, readInt10);
                            break;
                        case 10:
                            str10 = C295505oK.A08(parcel2, readInt10);
                            break;
                        default:
                            C295505oK.A0C(parcel2, readInt10);
                            break;
                    }
                }
                C295505oK.A0B(parcel2, A008);
                return new Credential(uri, str5, str6, str7, str8, str9, str10, arrayList7);
            case 86:
                int A009 = C295505oK.A00(parcel2);
                int i16 = 0;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                int i17 = 0;
                while (parcel2.dataPosition() < A009) {
                    int readInt11 = parcel2.readInt();
                    char c4 = (char) readInt11;
                    if (c4 == 1) {
                        z6 = C295505oK.A0G(parcel2, readInt11);
                    } else if (c4 == 2) {
                        z7 = C295505oK.A0G(parcel2, readInt11);
                    } else if (c4 == 3) {
                        z8 = C295505oK.A0G(parcel2, readInt11);
                    } else if (c4 == 4) {
                        i17 = Pxi.A05(parcel2, readInt11);
                    } else if (c4 != 1000) {
                        C295505oK.A0C(parcel2, readInt11);
                    } else {
                        i16 = Pxi.A05(parcel2, readInt11);
                    }
                }
                C295505oK.A0B(parcel2, A009);
                return new CredentialPickerConfig(i16, i17, z6, z7, z8);
            case 87:
                int A0010 = C295505oK.A00(parcel2);
                String[] strArr = null;
                CredentialPickerConfig credentialPickerConfig = null;
                CredentialPickerConfig credentialPickerConfig2 = null;
                String str11 = null;
                String str12 = null;
                int i18 = 0;
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                while (parcel2.dataPosition() < A0010) {
                    int readInt12 = parcel2.readInt();
                    char c5 = (char) readInt12;
                    if (c5 != 1000) {
                        switch (c5) {
                            case 1:
                                z9 = C295505oK.A0G(parcel2, readInt12);
                                break;
                            case 2:
                                strArr = C295505oK.A0K(parcel2, readInt12);
                                break;
                            case 3:
                                credentialPickerConfig = (CredentialPickerConfig) C295505oK.A04(parcel2, CredentialPickerConfig.CREATOR, readInt12);
                                break;
                            case 4:
                                credentialPickerConfig2 = (CredentialPickerConfig) C295505oK.A04(parcel2, CredentialPickerConfig.CREATOR, readInt12);
                                break;
                            case 5:
                                z10 = C295505oK.A0G(parcel2, readInt12);
                                break;
                            case 6:
                                str11 = C295505oK.A08(parcel2, readInt12);
                                break;
                            case 7:
                                str12 = C295505oK.A08(parcel2, readInt12);
                                break;
                            case 8:
                                z11 = C295505oK.A0G(parcel2, readInt12);
                                break;
                            default:
                                C295505oK.A0C(parcel2, readInt12);
                                break;
                        }
                    } else {
                        i18 = Pxh.A08(parcel2, readInt12);
                    }
                }
                C295505oK.A0B(parcel2, A0010);
                return new CredentialRequest(credentialPickerConfig, credentialPickerConfig2, str11, str12, strArr, i18, z9, z10, z11);
            case 88:
                int A0011 = C295505oK.A00(parcel2);
                CredentialPickerConfig credentialPickerConfig3 = null;
                String[] strArr2 = null;
                String str13 = null;
                String str14 = null;
                int i19 = 0;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                while (parcel2.dataPosition() < A0011) {
                    int readInt13 = parcel2.readInt();
                    char c6 = (char) readInt13;
                    if (c6 != 1000) {
                        switch (c6) {
                            case 1:
                                credentialPickerConfig3 = (CredentialPickerConfig) C295505oK.A04(parcel2, CredentialPickerConfig.CREATOR, readInt13);
                                break;
                            case 2:
                                z12 = C295505oK.A0G(parcel2, readInt13);
                                break;
                            case 3:
                                z13 = C295505oK.A0G(parcel2, readInt13);
                                break;
                            case 4:
                                strArr2 = C295505oK.A0K(parcel2, readInt13);
                                break;
                            case 5:
                                z14 = C295505oK.A0G(parcel2, readInt13);
                                break;
                            case 6:
                                str13 = C295505oK.A08(parcel2, readInt13);
                                break;
                            case 7:
                                str14 = C295505oK.A08(parcel2, readInt13);
                                break;
                            default:
                                C295505oK.A0C(parcel2, readInt13);
                                break;
                        }
                    } else {
                        i19 = Pxh.A08(parcel2, readInt13);
                    }
                }
                C295505oK.A0B(parcel2, A0011);
                return new HintRequest(credentialPickerConfig3, str13, str14, strArr2, i19, z12, z13, z14);
            case 89:
                int A0012 = C295505oK.A00(parcel2);
                String str15 = null;
                String str16 = null;
                while (parcel2.dataPosition() < A0012) {
                    int readInt14 = parcel2.readInt();
                    char c7 = (char) readInt14;
                    if (c7 != 1) {
                        str16 = Pxj.A0n(parcel2, str16, c7, readInt14);
                    } else {
                        str15 = C295505oK.A08(parcel2, readInt14);
                    }
                }
                C295505oK.A0B(parcel2, A0012);
                return new IdToken(str15, str16);
            case 90:
                int A0013 = C295505oK.A00(parcel2);
                ArrayList arrayList8 = null;
                String str17 = null;
                Account account = null;
                String str18 = null;
                String str19 = null;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                while (parcel2.dataPosition() < A0013) {
                    int readInt15 = parcel2.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            arrayList8 = C295505oK.A0A(parcel2, Scope.CREATOR, readInt15);
                            break;
                        case 2:
                            str17 = C295505oK.A08(parcel2, readInt15);
                            break;
                        case 3:
                            z15 = C295505oK.A0G(parcel2, readInt15);
                            break;
                        case 4:
                            z16 = C295505oK.A0G(parcel2, readInt15);
                            break;
                        case 5:
                            account = (Account) C295505oK.A04(parcel2, Account.CREATOR, readInt15);
                            break;
                        case 6:
                            str18 = C295505oK.A08(parcel2, readInt15);
                            break;
                        case 7:
                            str19 = C295505oK.A08(parcel2, readInt15);
                            break;
                        case 8:
                            z17 = C295505oK.A0G(parcel2, readInt15);
                            break;
                        default:
                            C295505oK.A0C(parcel2, readInt15);
                            break;
                    }
                }
                C295505oK.A0B(parcel2, A0013);
                return new AuthorizationRequest(account, str17, str18, str19, arrayList8, z15, z16, z17);
            case 91:
                int A0014 = C295505oK.A00(parcel2);
                String str20 = null;
                String str21 = null;
                String str22 = null;
                ArrayList arrayList9 = null;
                GoogleSignInAccount googleSignInAccount = null;
                PendingIntent pendingIntent2 = null;
                while (parcel2.dataPosition() < A0014) {
                    int readInt16 = parcel2.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            str20 = C295505oK.A08(parcel2, readInt16);
                            break;
                        case 2:
                            str21 = C295505oK.A08(parcel2, readInt16);
                            break;
                        case 3:
                            str22 = C295505oK.A08(parcel2, readInt16);
                            break;
                        case 4:
                            arrayList9 = C295505oK.A09(parcel2, readInt16);
                            break;
                        case 5:
                            googleSignInAccount = (GoogleSignInAccount) C295505oK.A04(parcel2, GoogleSignInAccount.CREATOR, readInt16);
                            break;
                        case 6:
                            pendingIntent2 = (PendingIntent) C295505oK.A04(parcel2, PendingIntent.CREATOR, readInt16);
                            break;
                        default:
                            C295505oK.A0C(parcel2, readInt16);
                            break;
                    }
                }
                C295505oK.A0B(parcel2, A0014);
                return new AuthorizationResult(pendingIntent2, googleSignInAccount, str20, str21, str22, arrayList9);
            case 92:
                int A0015 = C295505oK.A00(parcel2);
                BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
                BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
                String str23 = null;
                BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = null;
                BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = null;
                boolean z18 = false;
                int i20 = 0;
                while (parcel2.dataPosition() < A0015) {
                    int readInt17 = parcel2.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) C295505oK.A04(parcel2, BeginSignInRequest.PasswordRequestOptions.CREATOR, readInt17);
                            break;
                        case 2:
                            googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) C295505oK.A04(parcel2, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR, readInt17);
                            break;
                        case 3:
                            str23 = C295505oK.A08(parcel2, readInt17);
                            break;
                        case 4:
                            z18 = C295505oK.A0G(parcel2, readInt17);
                            break;
                        case 5:
                            i20 = Pxh.A08(parcel2, readInt17);
                            break;
                        case 6:
                            passkeysRequestOptions = (BeginSignInRequest.PasskeysRequestOptions) C295505oK.A04(parcel2, BeginSignInRequest.PasskeysRequestOptions.CREATOR, readInt17);
                            break;
                        case 7:
                            passkeyJsonRequestOptions = (BeginSignInRequest.PasskeyJsonRequestOptions) C295505oK.A04(parcel2, BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR, readInt17);
                            break;
                        default:
                            C295505oK.A0C(parcel2, readInt17);
                            break;
                    }
                }
                C295505oK.A0B(parcel2, A0015);
                return new BeginSignInRequest(googleIdTokenRequestOptions, passkeyJsonRequestOptions, passkeysRequestOptions, passwordRequestOptions, str23, i20, z18);
            case 93:
                int A0016 = C295505oK.A00(parcel2);
                PendingIntent pendingIntent3 = null;
                while (parcel2.dataPosition() < A0016) {
                    pendingIntent3 = Pxk.A08(pendingIntent3, parcel2);
                }
                C295505oK.A0B(parcel2, A0016);
                return new BeginSignInResult(pendingIntent3);
            case 94:
                int A0017 = C295505oK.A00(parcel2);
                int i21 = 0;
                while (parcel2.dataPosition() < A0017) {
                    int readInt18 = parcel2.readInt();
                    i21 = Pxj.A09(parcel2, (char) readInt18, 1, readInt18, i21);
                }
                C295505oK.A0B(parcel2, A0017);
                return new GetPhoneNumberHintIntentRequest(i21);
            case 95:
                int A0018 = C295505oK.A00(parcel2);
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                boolean z19 = false;
                int i22 = 0;
                while (parcel2.dataPosition() < A0018) {
                    int readInt19 = parcel2.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            str24 = C295505oK.A08(parcel2, readInt19);
                            break;
                        case 2:
                            str25 = C295505oK.A08(parcel2, readInt19);
                            break;
                        case 3:
                            str26 = C295505oK.A08(parcel2, readInt19);
                            break;
                        case 4:
                            str27 = C295505oK.A08(parcel2, readInt19);
                            break;
                        case 5:
                            z19 = C295505oK.A0G(parcel2, readInt19);
                            break;
                        case 6:
                            i22 = Pxh.A08(parcel2, readInt19);
                            break;
                        default:
                            C295505oK.A0C(parcel2, readInt19);
                            break;
                    }
                }
                C295505oK.A0B(parcel2, A0018);
                return new GetSignInIntentRequest(str24, str25, str26, str27, i22, z19);
            case 96:
                int A0019 = C295505oK.A00(parcel2);
                String str28 = null;
                String str29 = null;
                String str30 = null;
                ArrayList arrayList10 = null;
                boolean z20 = false;
                boolean z21 = false;
                boolean z22 = false;
                while (parcel2.dataPosition() < A0019) {
                    int readInt20 = parcel2.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            z20 = C295505oK.A0G(parcel2, readInt20);
                            break;
                        case 2:
                            str28 = C295505oK.A08(parcel2, readInt20);
                            break;
                        case 3:
                            str29 = C295505oK.A08(parcel2, readInt20);
                            break;
                        case 4:
                            z21 = C295505oK.A0G(parcel2, readInt20);
                            break;
                        case 5:
                            str30 = C295505oK.A08(parcel2, readInt20);
                            break;
                        case 6:
                            arrayList10 = C295505oK.A09(parcel2, readInt20);
                            break;
                        case 7:
                            z22 = C295505oK.A0G(parcel2, readInt20);
                            break;
                        default:
                            C295505oK.A0C(parcel2, readInt20);
                            break;
                    }
                }
                C295505oK.A0B(parcel2, A0019);
                return new BeginSignInRequest.GoogleIdTokenRequestOptions(str28, str29, str30, arrayList10, z20, z21, z22);
            case 97:
                int A0020 = C295505oK.A00(parcel2);
                String str31 = null;
                boolean z23 = false;
                while (parcel2.dataPosition() < A0020) {
                    int readInt21 = parcel2.readInt();
                    char c8 = (char) readInt21;
                    if (c8 != 1) {
                        str31 = Pxj.A0n(parcel2, str31, c8, readInt21);
                    } else {
                        z23 = C295505oK.A0G(parcel2, readInt21);
                    }
                }
                C295505oK.A0B(parcel2, A0020);
                return new BeginSignInRequest.PasskeyJsonRequestOptions(z23, str31);
            case 98:
                int A0021 = C295505oK.A00(parcel2);
                byte[] bArr2 = null;
                String str32 = null;
                boolean z24 = false;
                while (parcel2.dataPosition() < A0021) {
                    int readInt22 = parcel2.readInt();
                    char c9 = (char) readInt22;
                    if (c9 == 1) {
                        z24 = C295505oK.A0G(parcel2, readInt22);
                    } else if (c9 != 2) {
                        str32 = Pxj.A0o(parcel2, str32, c9, readInt22);
                    } else {
                        bArr2 = C295505oK.A0H(parcel2, readInt22);
                    }
                }
                C295505oK.A0B(parcel2, A0021);
                return new BeginSignInRequest.PasskeysRequestOptions(str32, bArr2, z24);
            default:
                int A0022 = C295505oK.A00(parcel2);
                boolean z25 = false;
                while (parcel2.dataPosition() < A0022) {
                    z25 = Pxj.A1X(parcel2, z25);
                }
                C295505oK.A0B(parcel2, A0022);
                return new BeginSignInRequest.PasswordRequestOptions(z25);
        }
        marginLayoutParams.bottomMargin = parcel2.readInt();
        marginLayoutParams.leftMargin = parcel2.readInt();
        marginLayoutParams.rightMargin = parcel2.readInt();
        marginLayoutParams.topMargin = parcel2.readInt();
        marginLayoutParams.height = parcel2.readInt();
        marginLayoutParams.width = parcel2.readInt();
        return marginLayoutParams;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new FeaturedIncentiveDetails[i];
            case 1:
                return new IncentiveCredentialList[i];
            case 2:
                return new IncentiveList[i];
            case 3:
                return new ClientSuppressionPolicy[i];
            case 4:
                return new FBPayLoggerData[i];
            case 5:
                return new LoggingContext[i];
            case 6:
                return new LoggingPolicy[i];
            case 7:
                return new LoggingData[i];
            case 8:
                return new OtcInput[i];
            case 9:
                return new OtcOptionState[i];
            case 10:
                return new APMCredential[i];
            case 11:
                return new CreditCard[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new PayPalCredential[i];
            case 13:
                return new TokenizedCard[i];
            case 14:
                return new LinkableTextParams[i];
            case 15:
                return new PaypalConsentLaunchParams[i];
            case 16:
                return new ShippingAddress[i];
            case 17:
                return new LinkParams[i];
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return new FBPayAddress[i];
            case 19:
                return new FormDialogParams[i];
            case 20:
                return new FormLogEvents[i];
            case 21:
                return new FormParams[i];
            case 22:
                return new MerchantInfo[i];
            case 23:
                return new FBPayOrder[i];
            case 24:
                return new FbPayAdditionalField[i];
            case 25:
                return new FbPayBankAccount[i];
            case 26:
                return new FbPayCreditCard[i];
            case 27:
                return new FbPayNewCreditCardOption[i];
            case 28:
                return new FbPayNewPayPalOption[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new FbPayPayPal[i];
            case 30:
                return new FbPayPaymentDefaultInfo[i];
            case 31:
                return new FbPayPaymentMethod[i];
            case 32:
                return new FbPayShopPay[i];
            case 33:
                return new FBPayHubRiskEnforcementData[i];
            case 34:
                return new UpcomingPayout[i];
            case 35:
                return new FBPayIcon[i];
            case 36:
                return new TooltipInfo[i];
            case 37:
                return new Address[i];
            case 38:
                return new CardDetails[i];
            case 39:
                return new Contact[i];
            case 40:
                return new Email[i];
            case Seq.NULL_REFNUM /*41*/:
                return new Phone[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new W3CCardDetail[i];
            case 43:
                return new DrmInitData[i];
            case 44:
                return new DrmInitData.SchemeData[i];
            case 45:
                return new AppInfoTable[i];
            case 46:
                return new EventMessage[i];
            case 47:
                return new PictureFrame[i];
            case 48:
                return new VorbisComment[i];
            case 49:
                return new IcyHeaders[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new IcyInfo[i];
            case 51:
                return new ApicFrame[i];
            case 52:
                return new BinaryFrame[i];
            case 53:
                return new ChapterFrame[i];
            case 54:
                return new ChapterTocFrame[i];
            case 55:
                return new CommentFrame[i];
            case 56:
                return new GeobFrame[i];
            case 57:
                return new InternalFrame[i];
            case 58:
                return new MlltFrame[i];
            case 59:
                return new PrivFrame[i];
            case 60:
                return new TextInformationFrame[i];
            case 61:
                return new UrlLinkFrame[i];
            case 62:
                return new MdtaMetadataEntry[i];
            case 63:
                return new MotionPhotoMetadata[i];
            case 64:
                return new SlowMotionData[i];
            case 65:
                return new SlowMotionData.Segment[i];
            case 66:
                return new SmtaMetadataEntry[i];
            case 67:
                return new PrivateCommand[i];
            case 68:
                return new SpliceInsertCommand[i];
            case 69:
                return new SpliceNullCommand[i];
            case 70:
                return new SpliceScheduleCommand[i];
            case 71:
                return new TimeSignalCommand[i];
            case 72:
                return new com.google.android.exoplayer2.metadata.vorbis.VorbisComment[i];
            case 73:
                return new CameraMotionData[i];
            case 74:
                return new DownloadRequest[i];
            case 75:
                return new StreamKey[i];
            case 76:
                return new Requirements[i];
            case 77:
                return new FlexboxLayout$LayoutParams[i];
            case 78:
                return new FlexboxLayoutManager.LayoutParams[i];
            case 79:
                return new FlexboxLayoutManager.SavedState[i];
            case 80:
                return new zzo[i];
            case 81:
                return new zzs[i];
            case 82:
                return new zzu[i];
            case 83:
                return new zzw[i];
            case 84:
                return new DeviceMetaData[i];
            case 85:
                return new Credential[i];
            case 86:
                return new CredentialPickerConfig[i];
            case 87:
                return new CredentialRequest[i];
            case 88:
                return new HintRequest[i];
            case 89:
                return new IdToken[i];
            case 90:
                return new AuthorizationRequest[i];
            case 91:
                return new AuthorizationResult[i];
            case 92:
                return new BeginSignInRequest[i];
            case 93:
                return new BeginSignInResult[i];
            case 94:
                return new GetPhoneNumberHintIntentRequest[i];
            case 95:
                return new GetSignInIntentRequest[i];
            case 96:
                return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
            case 97:
                return new BeginSignInRequest.PasskeyJsonRequestOptions[i];
            case 98:
                return new BeginSignInRequest.PasskeysRequestOptions[i];
            default:
                return new BeginSignInRequest.PasswordRequestOptions[i];
        }
    }
}
