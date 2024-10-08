package X;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import com.instagram.wellbeing.supportinbox.model.SupportInboxDetailBottomSheetModel;
import com.instagram.wonderwall.model.Destination;
import com.instagram.wonderwall.model.WallGifPostItem;
import com.instagram.wonderwall.model.WallImage;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallLaunchConfig;
import com.instagram.wonderwall.model.WallMediaPostItem;
import com.instagram.wonderwall.model.WallMenuConfig;
import com.instagram.wonderwall.model.WallMusicPostItem;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallRepostItem;
import com.instagram.wonderwall.model.WallText;
import com.instagram.wonderwall.model.WallTextPostItem;
import com.instagram.xme.immersivemedia.ImmersiveMediaInfo;
import com.meta.arfx.engine.interfaces.ARNetworkClientWorkerResponse;
import com.meta.flytrap.attachment.model.AttachmentCounter;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaType;
import com.meta.foa.accountswitcher.DBLSwitcherArgs;
import com.meta.foa.accountswitcher.FullSheetOverflowSwitcherArgs;
import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenCallerDismissCallback;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;
import com.meta.foa.fallbacklogin.UserLoginCredential;
import com.meta.foa.session.FoaUserSession;
import com.meta.payments.error.ErrorCode;
import com.meta.payments.model.configuration.AdditionalInfoKey;
import com.meta.payments.model.configuration.InternalPaymentConfiguration;
import com.meta.payments.model.configuration.PartnerId;
import com.meta.payments.model.configuration.PaymentContainerType;
import com.meta.payments.model.configuration.PaymentMode;
import com.meta.payments.model.offer.InternalOffer;
import com.meta.payments.model.payment.BillingAddressMode;
import com.meta.payments.model.payment.InternalPaymentContainer;
import com.meta.payments.model.payment.InternalPaymentDetails;
import com.meta.payments.model.payment.InternalPaymentItem;
import com.meta.payments.model.payment.InternalPaymentOptions;
import com.meta.payments.model.payment.InternalPaymentRequest;
import com.meta.payments.model.payment.InternalPaymentResponse;
import com.meta.payments.model.payment.InternalSummaryPaymentItem;
import com.meta.payments.model.payment.PaymentAddress;
import com.meta.payments.model.payment.PaymentCtaType;
import com.meta.payments.model.payment.PaymentCurrencyAmount;
import com.meta.payments.model.payment.SummaryPaymentItemType;
import com.meta.payments.model.shipping.InternalShippingOption;
import com.meta.payments.model.shipping.ShippingOptionType;
import com.spotify.sdk.android.auth.AuthorizationRequest;
import com.spotify.sdk.android.auth.AuthorizationResponse;
import fxcache.model.FxCalAccount;
import fxcache.model.FxCalAccountLinkageInfo;
import fxcache.model.FxCalAccountLinkageInfoForSwitcher;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import go.Seq;
import instagram.features.clips.viewer.recipesheet.RecipeSheetParams;
import java.util.ArrayList;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequest;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem;
import libraries.access.src.main.base.common.FXDeviceItem;
import libraries.fxcallauncher.model.FxUnifiedLauncherAddedAccount;
import org.webrtc.EglBase14Impl;

public final class SWU implements Parcelable.Creator {
    public final int A00;

    public static WallPostInfo A00(Parcel parcel) {
        0qQ.A0B(parcel, 0);
        return (WallPostInfo) WallPostInfo.CREATOR.createFromParcel(parcel);
    }

    public SWU(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, com.instagram.wellbeing.supportinbox.model.SupportInboxDetailBottomSheetModel] */
    /* JADX WARNING: type inference failed for: r7v16, types: [com.instagram.xme.immersivemedia.ImmersiveMediaInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v63, types: [java.lang.Object, libraries.fxcallauncher.model.FxUnifiedLauncherAddedAccount] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        int i;
        Object createFromParcel;
        Object createFromParcel2;
        Object createFromParcel3;
        Object createFromParcel4;
        Object createFromParcel5;
        Parcel parcel2 = parcel;
        switch (this.A00) {
            case 0:
                ? obj = new Object();
                obj.A03 = parcel2.readString();
                obj.A00 = parcel2.readString();
                obj.A01 = parcel2.readString();
                obj.A02 = parcel2.readString();
                return obj;
            case 1:
                return new Destination.Composer(C41848B3p.A1D(parcel2));
            case 2:
                return new Destination.Preview(C41848B3p.A1D(parcel2));
            case 3:
                return new WallGifPostItem((GifUrlImpl) Pxi.A0U(parcel2, WallGifPostItem.class), A00(parcel2), parcel2.readString());
            case 4:
                0qQ.A0B(parcel2, 0);
                Class<WallImage.CircularAvatar> cls = WallImage.CircularAvatar.class;
                return new WallImage.CircularAvatar(C41847B3o.A03(parcel2, cls), C41847B3o.A03(parcel2, cls));
            case 5:
                return new WallImage.Drawable(C41848B3p.A00(parcel2));
            case 6:
                return new WallInfo(C41847B3o.A03(parcel2, WallInfo.class), C41848B3p.A1D(parcel2), parcel2.readString(), AnonymousClass7TF.A1P(parcel2.readInt()), Pxi.A1P(parcel2));
            case 7:
                return new WallLaunchConfig((Destination) C41847B3o.A03(parcel2, WallLaunchConfig.class), C41848B3p.A1D(parcel2));
            case 8:
                return new WallMediaPostItem((1Xj) Pxi.A0U(parcel2, WallMediaPostItem.class), A00(parcel2));
            case 9:
                Pxi.A11(parcel2);
                return new WallMenuConfig();
            case 10:
                WallPostInfo A002 = A00(parcel2);
                AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) C41847B3o.A03(parcel2, WallMusicPostItem.class);
                int readInt = parcel2.readInt();
                ArrayList A0v = DbS.A0v(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    AnonymousClass7TF.A1M(A0v, parcel2.readInt());
                }
                return new WallMusicPostItem(audioOverlayTrack, A002, A0v);
            case 11:
                String A1D = C41848B3p.A1D(parcel2);
                Class<WallPostInfo> cls2 = WallPostInfo.class;
                User A03 = C41847B3o.A03(parcel2, cls2);
                WallInfo wallInfo = (WallInfo) WallInfo.CREATOR.createFromParcel(parcel2);
                String readString = parcel2.readString();
                boolean A1P = AnonymousClass7TF.A1P(parcel2.readInt());
                boolean A1X = C41848B3p.A1X(parcel2);
                boolean A1X2 = C41848B3p.A1X(parcel2);
                int readInt2 = parcel2.readInt();
                int readInt3 = parcel2.readInt();
                ArrayList A0v2 = DbS.A0v(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    C41848B3p.A1J(parcel2, cls2, A0v2);
                }
                return new WallPostInfo(A03, wallInfo, HMM.valueOf(parcel2.readString()), A1D, readString, A0v2, readInt2, parcel2.readInt(), parcel2.readLong(), A1P, A1X, A1X2);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new WallRepostItem(A00(parcel2), (WallPostItem) C41847B3o.A03(parcel2, WallRepostItem.class));
            case 13:
                return new WallText.Raw(C41848B3p.A1D(parcel2));
            case 14:
                return new WallText.Res(C41848B3p.A00(parcel2), parcel2.createStringArray());
            case 15:
                return new WallTextPostItem(A00(parcel2));
            case 16:
                if (C41848B3p.A00(parcel2) == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(C41848B3p.A1X(parcel2));
                }
                ? obj2 = new Object();
                obj2.A00 = valueOf;
                return obj2;
            case 17:
                ARNetworkClientWorkerResponse aRNetworkClientWorkerResponse = new ARNetworkClientWorkerResponse();
                int dataPosition = parcel2.dataPosition();
                int readInt4 = parcel2.readInt();
                if (readInt4 >= 4) {
                    try {
                        if (parcel2.dataPosition() - dataPosition < readInt4) {
                            aRNetworkClientWorkerResponse.A00 = parcel2.readInt();
                            if (parcel2.dataPosition() - dataPosition < readInt4) {
                                aRNetworkClientWorkerResponse.A02 = parcel2.readString();
                                if (parcel2.dataPosition() - dataPosition < readInt4) {
                                    aRNetworkClientWorkerResponse.A03 = parcel2.createByteArray();
                                    if (parcel2.dataPosition() - dataPosition < readInt4) {
                                        aRNetworkClientWorkerResponse.A01 = parcel2.readLong();
                                        if (dataPosition > Integer.MAX_VALUE - readInt4) {
                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                        }
                                    } else if (dataPosition > Integer.MAX_VALUE - readInt4) {
                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                    }
                                } else if (dataPosition > Integer.MAX_VALUE - readInt4) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                            } else if (dataPosition > Integer.MAX_VALUE - readInt4) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        } else if (dataPosition > i) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                        parcel2.setDataPosition(dataPosition + readInt4);
                        return aRNetworkClientWorkerResponse;
                    } finally {
                        if (dataPosition > Integer.MAX_VALUE - readInt4) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                        parcel2.setDataPosition(dataPosition + readInt4);
                    }
                } else {
                    throw new BadParcelableException("Parcelable too small");
                }
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                int A003 = C41848B3p.A00(parcel2);
                ArrayList A0v3 = DbS.A0v(A003);
                for (int i4 = 0; i4 != A003; i4++) {
                    C41848B3p.A1J(parcel2, AttachmentCounter.class, A0v3);
                }
                return new AttachmentCounter(A0v3);
            case 19:
                0qQ.A0B(parcel2, 0);
                C255463uA[] r1 = BugReportAttachment.A05;
                return new BugReportAttachment((BugReportAttachmentMediaSource) BugReportAttachmentMediaSource.CREATOR.createFromParcel(parcel2), BugReportAttachmentMediaType.valueOf(parcel2.readString()), parcel2.readString(), parcel2.readString(), C41848B3p.A1X(parcel2));
            case 20:
                return BugReportAttachmentMediaSource.valueOf(C41848B3p.A1D(parcel2));
            case 21:
                int A004 = C41848B3p.A00(parcel2);
                ArrayList A0v4 = DbS.A0v(A004);
                for (int i5 = 0; i5 != A004; i5 = JTT.A04(parcel2, UserAccountInfo.CREATOR, A0v4, i5)) {
                }
                return new DBLSwitcherArgs((FoaUserSession) C41847B3o.A03(parcel2, DBLSwitcherArgs.class), parcel2.readString(), parcel2.readString(), A0v4);
            case 22:
                0qQ.A0B(parcel2, 0);
                return new FullSheetOverflowSwitcherArgs((FoaUserSession) C41847B3o.A03(parcel2, FullSheetOverflowSwitcherArgs.class), parcel2.readString(), parcel2.readString());
            case 23:
                return new UserAccountInfo(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.createStringArrayList());
            case 24:
                Pxi.A11(parcel2);
                return CdsBottomSheetDimmingBehaviour.Default.A00;
            case 25:
                return new CdsBottomSheetDimmingBehaviour.FixedAlpha(Pxi.A02(parcel2));
            case 26:
                return new CdsBottomSheetTopSpan.Dp(C41848B3p.A00(parcel2));
            case 27:
                return new CdsBottomSheetTopSpan.ScreenPercent(Pxi.A02(parcel2));
            case 28:
                C51891G6g g6g = (C51891G6g) C14615TzM.A01(C51891G6g.class, C41847B3o.A12(parcel2));
                if (g6g != null) {
                    return new CdsOpenScreenCallerDismissCallback(g6g);
                }
                2SO r4 = 2SO.A03;
                0qQ.A0B("Expected non-null CallerDismissCallbackRunnable from BloksDataStorage", 2);
                2SK.A01(r4, "CdsOpenScreenCallerDismissCallback", "Expected non-null CallerDismissCallbackRunnable from BloksDataStorage", (Throwable) null, 0);
                return new CdsOpenScreenCallerDismissCallback(new C12815T8c());
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new CdsOpenScreenConfig$BottomSheetMargins(C41848B3p.A00(parcel2), parcel2.readInt(), parcel2.readInt(), parcel2.readInt());
            case 30:
                return new UserLoginCredential(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 31:
                return ErrorCode.valueOf(C41848B3p.A1D(parcel2));
            case 32:
                return AdditionalInfoKey.valueOf(C41848B3p.A1D(parcel2));
            case 33:
                int A005 = C41848B3p.A00(parcel2);
                int readInt5 = parcel2.readInt();
                String readString2 = parcel2.readString();
                int readInt6 = parcel2.readInt();
                ArrayList A0v5 = DbS.A0v(readInt6);
                for (int i6 = 0; i6 != readInt6; i6++) {
                    AnonymousClass7TF.A1M(A0v5, parcel2.readInt());
                }
                return new InternalPaymentConfiguration(Pxi.A0D(parcel2, InternalPaymentConfiguration.class), readString2, parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), A0v5, A005, readInt5);
            case 34:
                return PartnerId.valueOf(C41848B3p.A1D(parcel2));
            case 35:
                return PaymentContainerType.valueOf(C41848B3p.A1D(parcel2));
            case 36:
                return PaymentMode.valueOf(C41848B3p.A1D(parcel2));
            case 37:
                return new InternalOffer(Pxi.A0D(parcel2, InternalOffer.class), C41848B3p.A1D(parcel2), parcel2.readString());
            case 38:
                return BillingAddressMode.valueOf(C41848B3p.A1D(parcel2));
            case 39:
                return new InternalPaymentContainer(C41848B3p.A00(parcel2), parcel2.readString(), parcel2.readString());
            case 40:
                Object obj3 = null;
                if (C41848B3p.A00(parcel2) == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = InternalPaymentItem.CREATOR.createFromParcel(parcel2);
                }
                InternalPaymentItem internalPaymentItem = (InternalPaymentItem) createFromParcel;
                int readInt7 = parcel2.readInt();
                ArrayList A0v6 = DbS.A0v(readInt7);
                for (int i7 = 0; i7 != readInt7; i7 = JTT.A04(parcel2, InternalSummaryPaymentItem.CREATOR, A0v6, i7)) {
                }
                int readInt8 = parcel2.readInt();
                ArrayList A0v7 = DbS.A0v(readInt8);
                for (int i8 = 0; i8 != readInt8; i8 = JTT.A04(parcel2, InternalPaymentItem.CREATOR, A0v7, i8)) {
                }
                int readInt9 = parcel2.readInt();
                ArrayList A0v8 = DbS.A0v(readInt9);
                for (int i9 = 0; i9 != readInt9; i9 = JTT.A04(parcel2, InternalOffer.CREATOR, A0v8, i9)) {
                }
                if (parcel2.readInt() == 0) {
                    createFromParcel2 = null;
                } else {
                    createFromParcel2 = PaymentAddress.CREATOR.createFromParcel(parcel2);
                }
                PaymentAddress paymentAddress = (PaymentAddress) createFromParcel2;
                if (parcel2.readInt() != 0) {
                    obj3 = PaymentAddress.CREATOR.createFromParcel(parcel2);
                }
                PaymentAddress paymentAddress2 = (PaymentAddress) obj3;
                int readInt10 = parcel2.readInt();
                ArrayList A0v9 = DbS.A0v(readInt10);
                for (int i10 = 0; i10 != readInt10; i10 = JTT.A04(parcel2, InternalShippingOption.CREATOR, A0v9, i10)) {
                }
                return new InternalPaymentDetails(Pxi.A0D(parcel2, InternalPaymentDetails.class), internalPaymentItem, paymentAddress, paymentAddress2, parcel2.readString(), A0v6, A0v7, A0v8, A0v9);
            case Seq.NULL_REFNUM /*41*/:
                Integer num = null;
                if (C41848B3p.A00(parcel2) == 0) {
                    createFromParcel3 = null;
                } else {
                    createFromParcel3 = PaymentCurrencyAmount.CREATOR.createFromParcel(parcel2);
                }
                PaymentCurrencyAmount paymentCurrencyAmount = (PaymentCurrencyAmount) createFromParcel3;
                String readString3 = parcel2.readString();
                String readString4 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    num = C41847B3o.A12(parcel2);
                }
                return new InternalPaymentItem(Pxi.A0D(parcel2, InternalPaymentItem.class), paymentCurrencyAmount, num, readString3, readString4, parcel2.readString(), parcel2.readString());
            case Seq.RefTracker.REF_OFFSET /*42*/:
                0qQ.A0B(parcel2, 0);
                return new InternalPaymentOptions(Pxi.A0D(parcel2, InternalPaymentOptions.class), parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), C41848B3p.A1X(parcel2), C41848B3p.A1X(parcel2), C41848B3p.A1X(parcel2), C41848B3p.A1X(parcel2), C41848B3p.A1X(parcel2));
            case 43:
                0qQ.A0B(parcel2, 0);
                InternalPaymentConfiguration internalPaymentConfiguration = (InternalPaymentConfiguration) InternalPaymentConfiguration.CREATOR.createFromParcel(parcel2);
                InternalPaymentDetails internalPaymentDetails = (InternalPaymentDetails) InternalPaymentDetails.CREATOR.createFromParcel(parcel2);
                if (parcel2.readInt() == 0) {
                    createFromParcel4 = null;
                } else {
                    createFromParcel4 = InternalPaymentOptions.CREATOR.createFromParcel(parcel2);
                }
                return new InternalPaymentRequest(Pxi.A0D(parcel2, InternalPaymentRequest.class), internalPaymentConfiguration, internalPaymentDetails, (InternalPaymentOptions) createFromParcel4);
            case 44:
                String A1D2 = C41848B3p.A1D(parcel2);
                String readString5 = parcel2.readString();
                InternalPaymentContainer internalPaymentContainer = (InternalPaymentContainer) InternalPaymentContainer.CREATOR.createFromParcel(parcel2);
                String readString6 = parcel2.readString();
                String readString7 = parcel2.readString();
                String readString8 = parcel2.readString();
                Object obj4 = null;
                if (parcel2.readInt() == 0) {
                    createFromParcel5 = null;
                } else {
                    createFromParcel5 = PaymentAddress.CREATOR.createFromParcel(parcel2);
                }
                PaymentAddress paymentAddress3 = (PaymentAddress) createFromParcel5;
                if (parcel2.readInt() != 0) {
                    obj4 = PaymentAddress.CREATOR.createFromParcel(parcel2);
                }
                PaymentAddress paymentAddress4 = (PaymentAddress) obj4;
                int readInt11 = parcel2.readInt();
                ArrayList A0v10 = DbS.A0v(readInt11);
                for (int i11 = 0; i11 != readInt11; i11 = JTT.A04(parcel2, InternalOffer.CREATOR, A0v10, i11)) {
                }
                return new InternalPaymentResponse(Pxi.A0D(parcel2, InternalPaymentResponse.class), internalPaymentContainer, paymentAddress3, paymentAddress4, A1D2, readString5, readString6, readString7, readString8, A0v10);
            case 45:
                0qQ.A0B(parcel2, 0);
                return new InternalSummaryPaymentItem(Pxi.A0D(parcel2, InternalSummaryPaymentItem.class), (PaymentCurrencyAmount) PaymentCurrencyAmount.CREATOR.createFromParcel(parcel2), parcel2.readString(), parcel2.readInt());
            case 46:
                0qQ.A0B(parcel2, 0);
                return new PaymentAddress(parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.createStringArrayList());
            case 47:
                return PaymentCtaType.valueOf(C41848B3p.A1D(parcel2));
            case 48:
                return new PaymentCurrencyAmount(C41848B3p.A1D(parcel2), parcel2.readString());
            case 49:
                return SummaryPaymentItemType.valueOf(C41848B3p.A1D(parcel2));
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                0qQ.A0B(parcel2, 0);
                return new InternalShippingOption(Pxi.A0D(parcel2, InternalShippingOption.class), (PaymentCurrencyAmount) PaymentCurrencyAmount.CREATOR.createFromParcel(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), C41848B3p.A1X(parcel2));
            case 51:
                return ShippingOptionType.valueOf(C41848B3p.A1D(parcel2));
            case 52:
                return new AuthorizationRequest(parcel2);
            case 53:
                return new AuthorizationResponse(parcel2);
            case 54:
                String A1D3 = C41848B3p.A1D(parcel2);
                if (A1D3 == null) {
                    A1D3 = "";
                }
                String readString9 = parcel2.readString();
                if (readString9 == null) {
                    readString9 = "";
                }
                String readString10 = parcel2.readString();
                if (readString10 == null) {
                    readString10 = "";
                }
                String readString11 = parcel2.readString();
                if (readString11 == null) {
                    readString11 = "";
                }
                String readString12 = parcel2.readString();
                if (readString12 == null) {
                    readString12 = "";
                }
                String readString13 = parcel2.readString();
                if (readString13 == null) {
                    readString13 = "";
                }
                String readString14 = parcel2.readString();
                if (readString14 == null) {
                    readString14 = "";
                }
                return new FxCalAccount(A1D3, readString9, readString10, readString11, readString12, readString13, readString14, parcel2.readString(), parcel2.readInt(), parcel2.readInt(), parcel2.readInt());
            case 55:
                0qQ.A0B(parcel2, 0);
                0sn r3 = 0sn.A00;
                parcel2.readParcelableArray(FxCalAccount.class.getClassLoader());
                long readLong = parcel2.readLong();
                String readString15 = parcel2.readString();
                if (readString15 == null) {
                    readString15 = "UNSET";
                }
                return new FxCalAccountLinkageInfo(1xJ.A00(readString15), r3, readLong);
            case 56:
                0qQ.A0B(parcel2, 0);
                0sn r32 = 0sn.A00;
                parcel2.readParcelableArray(FxCalAccount.class.getClassLoader());
                long readLong2 = parcel2.readLong();
                String readString16 = parcel2.readString();
                if (readString16 == null) {
                    readString16 = "UNSET";
                }
                return new FxCalAccountLinkageInfoForSwitcher(1xJ.A00(readString16), r32, readLong2);
            case 57:
                String A1D4 = C41848B3p.A1D(parcel2);
                if (A1D4 == null) {
                    A1D4 = "";
                }
                String readString17 = parcel2.readString();
                if (readString17 == null) {
                    readString17 = "";
                }
                String readString18 = parcel2.readString();
                if (readString18 == null) {
                    readString18 = "";
                }
                String readString19 = parcel2.readString();
                if (readString19 == null) {
                    readString19 = "";
                }
                String readString20 = parcel2.readString();
                if (readString20 == null) {
                    readString20 = "";
                }
                String readString21 = parcel2.readString();
                if (readString21 == null) {
                    readString21 = "";
                }
                String readString22 = parcel2.readString();
                if (readString22 == null) {
                    readString22 = "";
                }
                int readInt12 = parcel2.readInt();
                int readInt13 = parcel2.readInt();
                int readInt14 = parcel2.readInt();
                String readString23 = parcel2.readString();
                boolean A1U = Pxg.A1U(parcel2);
                String readString24 = parcel2.readString();
                if (readString24 == null) {
                    readString24 = "";
                }
                return new FxCalAccountWithSwitcherInfo(A1D4, readString17, readString18, readString19, readString20, readString21, readString22, readString23, readString24, readInt12, readInt13, readInt14, A1U);
            case 58:
                return new RecipeSheetParams(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readInt(), parcel2.readInt(), parcel2.readLong(), AnonymousClass7TF.A1P(parcel2.readInt()), Pxi.A1P(parcel2));
            case 59:
                return new FXAccessLibraryDeviceRequest(parcel2);
            case 60:
                return new FXAccessLibraryDeviceRequestItem(parcel2);
            case 61:
                return new FXDeviceItem(parcel2);
            default:
                String A1D5 = C41848B3p.A1D(parcel2);
                String str = "";
                if (A1D5 == null) {
                    A1D5 = str;
                }
                String readString25 = parcel2.readString();
                if (readString25 == null) {
                    readString25 = str;
                }
                String readString26 = parcel2.readString();
                if (readString26 != null) {
                    str = readString26;
                }
                ? obj5 = new Object();
                obj5.A02 = A1D5;
                obj5.A01 = readString25;
                obj5.A00 = str;
                return obj5;
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new SupportInboxDetailBottomSheetModel[i];
            case 1:
                return new Destination.Composer[i];
            case 2:
                return new Destination.Preview[i];
            case 3:
                return new WallGifPostItem[i];
            case 4:
                return new WallImage.CircularAvatar[i];
            case 5:
                return new WallImage.Drawable[i];
            case 6:
                return new WallInfo[i];
            case 7:
                return new WallLaunchConfig[i];
            case 8:
                return new WallMediaPostItem[i];
            case 9:
                return new WallMenuConfig[i];
            case 10:
                return new WallMusicPostItem[i];
            case 11:
                return new WallPostInfo[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new WallRepostItem[i];
            case 13:
                return new WallText.Raw[i];
            case 14:
                return new WallText.Res[i];
            case 15:
                return new WallTextPostItem[i];
            case 16:
                return new ImmersiveMediaInfo[i];
            case 17:
                return new ARNetworkClientWorkerResponse[i];
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return new AttachmentCounter[i];
            case 19:
                return new BugReportAttachment[i];
            case 20:
                return new BugReportAttachmentMediaSource[i];
            case 21:
                return new DBLSwitcherArgs[i];
            case 22:
                return new FullSheetOverflowSwitcherArgs[i];
            case 23:
                return new UserAccountInfo[i];
            case 24:
                return new CdsBottomSheetDimmingBehaviour.Default[i];
            case 25:
                return new CdsBottomSheetDimmingBehaviour.FixedAlpha[i];
            case 26:
                return new CdsBottomSheetTopSpan.Dp[i];
            case 27:
                return new CdsBottomSheetTopSpan.ScreenPercent[i];
            case 28:
                return new CdsOpenScreenCallerDismissCallback[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new CdsOpenScreenConfig$BottomSheetMargins[i];
            case 30:
                return new UserLoginCredential[i];
            case 31:
                return new ErrorCode[i];
            case 32:
                return new AdditionalInfoKey[i];
            case 33:
                return new InternalPaymentConfiguration[i];
            case 34:
                return new PartnerId[i];
            case 35:
                return new PaymentContainerType[i];
            case 36:
                return new PaymentMode[i];
            case 37:
                return new InternalOffer[i];
            case 38:
                return new BillingAddressMode[i];
            case 39:
                return new InternalPaymentContainer[i];
            case 40:
                return new InternalPaymentDetails[i];
            case Seq.NULL_REFNUM /*41*/:
                return new InternalPaymentItem[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new InternalPaymentOptions[i];
            case 43:
                return new InternalPaymentRequest[i];
            case 44:
                return new InternalPaymentResponse[i];
            case 45:
                return new InternalSummaryPaymentItem[i];
            case 46:
                return new PaymentAddress[i];
            case 47:
                return new PaymentCtaType[i];
            case 48:
                return new PaymentCurrencyAmount[i];
            case 49:
                return new SummaryPaymentItemType[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new InternalShippingOption[i];
            case 51:
                return new ShippingOptionType[i];
            case 52:
                return new AuthorizationRequest[i];
            case 53:
                return new AuthorizationResponse[i];
            case 54:
                return new FxCalAccount[i];
            case 55:
                return new FxCalAccountLinkageInfo[i];
            case 56:
                return new FxCalAccountLinkageInfoForSwitcher[i];
            case 57:
                return new FxCalAccountWithSwitcherInfo[i];
            case 58:
                return new RecipeSheetParams[i];
            case 59:
                return new FXAccessLibraryDeviceRequest[i];
            case 60:
                return new FXAccessLibraryDeviceRequestItem[i];
            case 61:
                return new FXDeviceItem[i];
            default:
                return new FxUnifiedLauncherAddedAccount[i];
        }
    }
}
