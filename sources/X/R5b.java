package X;

import com.google.protobuf.Any;
import com.google.protobuf.Api;
import com.google.protobuf.BoolValue;
import com.google.protobuf.BytesValue;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.Duration;
import com.google.protobuf.Empty;
import com.google.protobuf.Enum;
import com.google.protobuf.EnumValue;
import com.google.protobuf.Field;
import com.google.protobuf.FieldMask;
import com.google.protobuf.FloatValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;
import com.google.protobuf.ListValue;
import com.google.protobuf.Mixin;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import com.google.protobuf.StringValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.protobuf.Type;
import com.google.protobuf.UInt32Value;
import com.google.protobuf.UInt64Value;
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.Value;
import com.oculus.applinks.LinkAddress;
import com.oculus.applinks.LinkAppDeviceIdentityRequest;
import com.oculus.applinks.LinkAppDeviceIdentityResponse;
import com.oculus.applinks.LinkAppLinkInfoRequest;
import com.oculus.applinks.LinkAppLinkInfoResponse;
import com.oculus.applinks.LinkAppRegisterRequest;
import com.oculus.applinks.LinkAppRegisterResponse;
import com.oculus.applinks.LinkAppRequest;
import com.oculus.applinks.LinkAppResponse;
import com.oculus.applinks.LinkedAppConnectedEvent;
import com.oculus.applinks.LinkedAppDisconnectedEvent;
import com.oculus.applinks.UnlinkAppRequest;
import com.oculus.applinks.UnlinkAppResponse;
import com.oculus.atc.CreateSoftApNetwork;
import com.oculus.atc.CreateWifiDirectNetwork;
import com.oculus.atc.DestroySoftApNetwork;
import com.oculus.atc.DestroySoftApNetworkResult;
import com.oculus.atc.DestroyWifiDirectNetwork;
import com.oculus.atc.DestroyWifiDirectNetworkResult;
import com.oculus.atc.EnableEncryption;
import com.oculus.atc.EndLinkSetup;
import com.oculus.atc.EndWifiSession;
import com.oculus.atc.JoinAccessPoint;
import com.oculus.atc.JoinAccessPointResult;
import com.oculus.atc.JoinWifiDirectGroup;
import com.oculus.atc.JoinWifiDirectGroupResult;
import com.oculus.atc.LePairingInfo;
import com.oculus.atc.LeaveAccessPoint;
import com.oculus.atc.LeaveAccessPointResult;
import com.oculus.atc.LeaveWifiDirectGroup;
import com.oculus.atc.LeaveWifiDirectGroupResult;
import com.oculus.atc.ManifestComplete;
import com.oculus.atc.NetworkAddress;
import com.oculus.atc.RequestEncryption;
import com.oculus.atc.SetLinkMessage;
import com.oculus.atc.SetManifestAuthorityKey;
import com.oculus.atc.SetSessionInfo;
import com.oculus.atc.SetWifiProperties;
import com.oculus.atc.SetWifiPropertiesResult;
import com.oculus.atc.SoftApClientAddressUpdatedEvent;
import com.oculus.atc.SoftApClientConnectedEvent;
import com.oculus.atc.SoftApClientDisconnectedEvent;
import com.oculus.atc.SoftApCredentials;
import com.oculus.atc.SoftApNetworkInfo;
import com.oculus.atc.SwitchLink;
import com.oculus.atc.WifiDirectNetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class R5b extends T5J {
    public static Map defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public C11289SJn unknownFields = C11289SJn.A05;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.5I7, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.5I7, java.io.IOException] */
    public static R5b A04(R5b r5b, byte[] bArr) {
        AnonymousClass5I7 r2;
        byte[] bArr2 = bArr;
        int length = bArr.length;
        SQg A00 = SQg.A00();
        R5b r5b2 = (R5b) r5b.A0K(AnonymousClass05K.A0N, (Object) null, (Object) null);
        try {
            C13903TjQ A0U = Pxg.A0U(r5b2);
            A0U.CoA(new SFF(A00), r5b2, bArr2, 0, length);
            A0U.ClW(r5b2);
            if (r5b2.memoizedHashCode == 0) {
                A0A(r5b2);
                return r5b2;
            }
            throw new RuntimeException();
        } catch (AnonymousClass5I7 e) {
            boolean z = e.A01;
            r2 = e;
            if (z) {
                ? iOException = new IOException(e.getMessage(), e);
                iOException.A00 = null;
                r2 = iOException;
            }
            r2.A00 = r5b2;
            throw r2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof AnonymousClass5I7) {
                throw e2.getCause();
            }
            ? iOException2 = new IOException(e2.getMessage(), e2);
            iOException2.A00 = null;
            r2 = iOException2;
            r2.A00 = r5b2;
            throw r2;
        } catch (IndexOutOfBoundsException unused) {
            AnonymousClass5I7 A02 = AnonymousClass5I7.A02();
            A02.A00 = r5b2;
            throw A02;
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.5I7, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.5I7, java.io.IOException] */
    public static R5b A01(C11363SPb sPb, SQg sQg, R5b r5b) {
        AnonymousClass5I7 r2;
        Throwable e;
        R5b r5b2 = (R5b) r5b.A0K(AnonymousClass05K.A0N, (Object) null, (Object) null);
        try {
            C13903TjQ A0U = Pxg.A0U(r5b2);
            SUM sum = sPb.A01;
            if (sum == null) {
                sum = new SUM(sPb);
            }
            A0U.Co9(sum, sQg, r5b2);
            A0U.ClW(r5b2);
            return r5b2;
        } catch (AnonymousClass5I7 e2) {
            boolean z = e2.A01;
            r2 = e2;
            if (z) {
                ? iOException = new IOException(e2.getMessage(), e2);
                iOException.A00 = null;
                r2 = iOException;
            }
            r2.A00 = r5b2;
            throw r2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof AnonymousClass5I7) {
                e = e3.getCause();
                throw e;
            }
            ? iOException2 = new IOException(e3.getMessage(), e3);
            iOException2.A00 = null;
            r2 = iOException2;
            r2.A00 = r5b2;
            throw r2;
        } catch (RuntimeException e4) {
            e = e4;
            if (e.getCause() instanceof AnonymousClass5I7) {
                throw e.getCause();
            }
            throw e;
        }
    }

    public static R5b A02(R5b r5b, InputStream inputStream) {
        R5b A01 = A01(new R3A(inputStream), SQg.A00(), r5b);
        A0A(A01);
        return A01;
    }

    public static C10704Rwi A07(T5J t5j, String str, Object[] objArr) {
        return new C10704Rwi(t5j, str, objArr);
    }

    public static void A0B(R5b r5b, Class cls) {
        defaultInstanceMap.put(cls, r5b);
    }

    public static final boolean A0C(R5b r5b) {
        byte byteValue = ((Number) r5b.A0K(AnonymousClass05K.A00, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean CVR = Pxg.A0U(r5b).CVR(r5b);
        Integer num = AnonymousClass05K.A01;
        R5b r5b2 = null;
        if (CVR) {
            r5b2 = r5b;
        }
        r5b.A0K(num, r5b2, (Object) null);
        return CVR;
    }

    public final R4O A0I() {
        return (R4O) A0K(AnonymousClass05K.A0Y, (Object) null, (Object) null);
    }

    public final R4O A0J() {
        R4O r4o = (R4O) A0K(AnonymousClass05K.A0Y, (Object) null, (Object) null);
        r4o.A05(this);
        return r4o;
    }

    public final /* bridge */ /* synthetic */ R5b Avt() {
        return (R5b) A0K(AnonymousClass05K.A0j, (Object) null, (Object) null);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return SH5.A02.A00(cls).ASr(this, obj);
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int CL6 = Pxg.A0U(this).CL6(this);
        this.memoizedHashCode = CL6;
        return CL6;
    }

    public static R5b A03(R5b r5b, ByteBuffer byteBuffer) {
        C11363SPb A07;
        SQg A00 = SQg.A00();
        if (byteBuffer.hasArray()) {
            A07 = C11363SPb.A07(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        } else if (!byteBuffer.isDirect() || !UnsafeUtil.A05) {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            A07 = C11363SPb.A07(bArr, 0, remaining);
        } else {
            A07 = new R39(byteBuffer);
        }
        R5b A01 = A01(A07, A00, r5b);
        A0A(A01);
        A0A(A01);
        return A01;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.R30, X.TRv] */
    public static R30 A05(C13965TmS tmS) {
        int A0A = Pxg.A0A(tmS);
        R30 r30 = (R30) tmS;
        if (A0A >= r30.A00) {
            int[] copyOf = Arrays.copyOf(r30.A01, A0A);
            int i = r30.A00;
            ? tRv = new C13255TRv();
            tRv.A01 = copyOf;
            tRv.A00 = i;
            return tRv;
        }
        throw Pxe.A0g();
    }

    public static C13982TnY A06(C13982TnY tnY) {
        return tnY.Cop(Pxg.A0A(tnY));
    }

    public static C10704Rwi A08(T5J t5j, String str, Object[] objArr) {
        return A07(t5j, str, objArr);
    }

    public static Object A09(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw Pxe.A0u("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw Pxe.A0u("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void A0A(R5b r5b) {
        if (!A0C(r5b)) {
            AnonymousClass5I7 A0T = Pxg.A0T(new RuntimeException(C273654mx.A00(59)).getMessage());
            A0T.A00 = r5b;
            throw A0T;
        }
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("# ");
        A1A.append(obj);
        C11310SKy.A01(this, A1A, 0);
        return A1A.toString();
    }

    public Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        C74232PrL prL2;
        C74232PrL prL3;
        C74232PrL prL4;
        C74232PrL prL5;
        C74232PrL prL6;
        C74232PrL prL7;
        C74232PrL prL8;
        C74232PrL prL9;
        C74232PrL prL10;
        C74232PrL prL11;
        C74232PrL prL12;
        C74232PrL prL13;
        C74232PrL prL14;
        C74232PrL prL15;
        C74232PrL prL16;
        C74232PrL prL17;
        C74232PrL prL18;
        C74232PrL prL19;
        C74232PrL prL20;
        C74232PrL prL21;
        C74232PrL prL22;
        C74232PrL prL23;
        C74232PrL prL24;
        C74232PrL prL25;
        C74232PrL prL26;
        C74232PrL prL27;
        C74232PrL prL28;
        C74232PrL prL29;
        C74232PrL prL30;
        C74232PrL prL31;
        C74232PrL prL32;
        C74232PrL prL33;
        C74232PrL prL34;
        C74232PrL prL35;
        C74232PrL prL36;
        C74232PrL prL37;
        C74232PrL prL38;
        C74232PrL prL39;
        C74232PrL prL40;
        C74232PrL prL41;
        C74232PrL prL42;
        C74232PrL prL43;
        C74232PrL prL44;
        C74232PrL prL45;
        C74232PrL prL46;
        C74232PrL prL47;
        C74232PrL prL48;
        C74232PrL prL49;
        C74232PrL prL50;
        C74232PrL prL51;
        C74232PrL prL52;
        C74232PrL prL53;
        C74232PrL prL54;
        C74232PrL prL55;
        C74232PrL prL56;
        C74232PrL prL57;
        C74232PrL prL58;
        C74232PrL prL59;
        C74232PrL prL60;
        C74232PrL prL61;
        C74232PrL prL62;
        C74232PrL prL63;
        C74232PrL prL64;
        C74232PrL prL65;
        C74232PrL prL66;
        C74232PrL prL67;
        C74232PrL prL68;
        C74232PrL prL69;
        C74232PrL prL70;
        C74232PrL prL71;
        C74232PrL prL72;
        C74232PrL prL73;
        if (this instanceof LinkAppRegisterRequest) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAppRegisterRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"nonce_", "appPublicKey_"});
                case 3:
                    return new LinkAppRegisterRequest();
                case 4:
                    return new C8722R3i();
                case 5:
                    return LinkAppRegisterRequest.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL74 = LinkAppRegisterRequest.PARSER;
                    if (prL74 != null) {
                        return prL74;
                    }
                    synchronized (LinkAppRegisterRequest.class) {
                        prL73 = LinkAppRegisterRequest.PARSER;
                        if (prL73 == null) {
                            SQg sQg = T5L.A01;
                            prL73 = C66580MXl.A0K(LinkAppRegisterRequest.DEFAULT_INSTANCE);
                            LinkAppRegisterRequest.PARSER = prL73;
                        }
                    }
                    return prL73;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof LinkAppLinkInfoRequest) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAppLinkInfoRequest.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\f\u0004\f", new Object[]{"nonce_", "serviceUUID_", "linkType_", "requestType_"});
                case 3:
                    return new LinkAppLinkInfoRequest();
                case 4:
                    return new C8720R3g();
                case 5:
                    return LinkAppLinkInfoRequest.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL75 = LinkAppLinkInfoRequest.PARSER;
                    if (prL75 != null) {
                        return prL75;
                    }
                    synchronized (LinkAppLinkInfoRequest.class) {
                        prL72 = LinkAppLinkInfoRequest.PARSER;
                        if (prL72 == null) {
                            SQg sQg2 = T5L.A01;
                            prL72 = C66580MXl.A0K(LinkAppLinkInfoRequest.DEFAULT_INSTANCE);
                            LinkAppLinkInfoRequest.PARSER = prL72;
                        }
                    }
                    return prL72;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof LinkAppDeviceIdentityRequest) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAppDeviceIdentityRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"nonce_", "serviceUUID_"});
                case 3:
                    return new LinkAppDeviceIdentityRequest();
                case 4:
                    return new C8718R3e();
                case 5:
                    return LinkAppDeviceIdentityRequest.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL76 = LinkAppDeviceIdentityRequest.PARSER;
                    if (prL76 != null) {
                        return prL76;
                    }
                    synchronized (LinkAppDeviceIdentityRequest.class) {
                        prL71 = LinkAppDeviceIdentityRequest.PARSER;
                        if (prL71 == null) {
                            SQg sQg3 = T5L.A01;
                            prL71 = C66580MXl.A0K(LinkAppDeviceIdentityRequest.DEFAULT_INSTANCE);
                            LinkAppDeviceIdentityRequest.PARSER = prL71;
                        }
                    }
                    return prL71;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof WifiDirectNetworkInfo) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(WifiDirectNetworkInfo.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003\t\u0004\u000b", new Object[]{"status_", "addresses_", NetworkAddress.class, "credentials_", "portNumber_"});
                case 3:
                    return new WifiDirectNetworkInfo();
                case 4:
                    return new R4M();
                case 5:
                    return WifiDirectNetworkInfo.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL77 = WifiDirectNetworkInfo.PARSER;
                    if (prL77 != null) {
                        return prL77;
                    }
                    synchronized (WifiDirectNetworkInfo.class) {
                        prL70 = WifiDirectNetworkInfo.PARSER;
                        if (prL70 == null) {
                            SQg sQg4 = T5L.A01;
                            prL70 = C66580MXl.A0K(WifiDirectNetworkInfo.DEFAULT_INSTANCE);
                            WifiDirectNetworkInfo.PARSER = prL70;
                        }
                    }
                    return prL70;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof WifiDirectNetworkInfo.Credentials) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(WifiDirectNetworkInfo.Credentials.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"networkName_", "passphrase_"});
                case 3:
                    return new WifiDirectNetworkInfo.Credentials();
                case 4:
                    return new R4N();
                case 5:
                    return WifiDirectNetworkInfo.Credentials.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL78 = WifiDirectNetworkInfo.Credentials.PARSER;
                    if (prL78 != null) {
                        return prL78;
                    }
                    synchronized (WifiDirectNetworkInfo.Credentials.class) {
                        prL69 = WifiDirectNetworkInfo.Credentials.PARSER;
                        if (prL69 == null) {
                            SQg sQg5 = T5L.A01;
                            prL69 = C66580MXl.A0K(WifiDirectNetworkInfo.Credentials.DEFAULT_INSTANCE);
                            WifiDirectNetworkInfo.Credentials.PARSER = prL69;
                        }
                    }
                    return prL69;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof SwitchLink) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SwitchLink.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"target_"});
                case 3:
                    return new SwitchLink();
                case 4:
                    return new R4L();
                case 5:
                    return SwitchLink.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL79 = SwitchLink.PARSER;
                    if (prL79 != null) {
                        return prL79;
                    }
                    synchronized (SwitchLink.class) {
                        prL68 = SwitchLink.PARSER;
                        if (prL68 == null) {
                            SQg sQg6 = T5L.A01;
                            prL68 = C66580MXl.A0K(SwitchLink.DEFAULT_INSTANCE);
                            SwitchLink.PARSER = prL68;
                        }
                    }
                    return prL68;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof SoftApNetworkInfo) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SoftApNetworkInfo.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003\t\u0004\u000b\u0005\u000b", new Object[]{"status_", "addresses_", NetworkAddress.class, "credentials_", "portNumber_", "channel_"});
                case 3:
                    return new SoftApNetworkInfo();
                case 4:
                    return new R4K();
                case 5:
                    return SoftApNetworkInfo.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL80 = SoftApNetworkInfo.PARSER;
                    if (prL80 != null) {
                        return prL80;
                    }
                    synchronized (SoftApNetworkInfo.class) {
                        prL67 = SoftApNetworkInfo.PARSER;
                        if (prL67 == null) {
                            SQg sQg7 = T5L.A01;
                            prL67 = C66580MXl.A0K(SoftApNetworkInfo.DEFAULT_INSTANCE);
                            SoftApNetworkInfo.PARSER = prL67;
                        }
                    }
                    return prL67;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof SoftApCredentials) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SoftApCredentials.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"ssid_", "password_"});
                case 3:
                    return new SoftApCredentials();
                case 4:
                    return new R4J();
                case 5:
                    return SoftApCredentials.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL81 = SoftApCredentials.PARSER;
                    if (prL81 != null) {
                        return prL81;
                    }
                    synchronized (SoftApCredentials.class) {
                        prL66 = SoftApCredentials.PARSER;
                        if (prL66 == null) {
                            SQg sQg8 = T5L.A01;
                            prL66 = C66580MXl.A0K(SoftApCredentials.DEFAULT_INSTANCE);
                            SoftApCredentials.PARSER = prL66;
                        }
                    }
                    return prL66;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof SoftApClientDisconnectedEvent) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SoftApClientDisconnectedEvent.DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                case 3:
                    return new R5b();
                case 4:
                    return new R4I();
                case 5:
                    return SoftApClientDisconnectedEvent.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL82 = SoftApClientDisconnectedEvent.PARSER;
                    if (prL82 != null) {
                        return prL82;
                    }
                    synchronized (SoftApClientDisconnectedEvent.class) {
                        prL65 = SoftApClientDisconnectedEvent.PARSER;
                        if (prL65 == null) {
                            SQg sQg9 = T5L.A01;
                            prL65 = C66580MXl.A0K(SoftApClientDisconnectedEvent.DEFAULT_INSTANCE);
                            SoftApClientDisconnectedEvent.PARSER = prL65;
                        }
                    }
                    return prL65;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof SoftApClientConnectedEvent) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SoftApClientConnectedEvent.DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                case 3:
                    return new R5b();
                case 4:
                    return new R4H();
                case 5:
                    return SoftApClientConnectedEvent.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL83 = SoftApClientConnectedEvent.PARSER;
                    if (prL83 != null) {
                        return prL83;
                    }
                    synchronized (SoftApClientConnectedEvent.class) {
                        prL64 = SoftApClientConnectedEvent.PARSER;
                        if (prL64 == null) {
                            SQg sQg10 = T5L.A01;
                            prL64 = C66580MXl.A0K(SoftApClientConnectedEvent.DEFAULT_INSTANCE);
                            SoftApClientConnectedEvent.PARSER = prL64;
                        }
                    }
                    return prL64;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof SoftApClientAddressUpdatedEvent) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SoftApClientAddressUpdatedEvent.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"addresses_", NetworkAddress.class});
                case 3:
                    return new SoftApClientAddressUpdatedEvent();
                case 4:
                    return new R4G();
                case 5:
                    return SoftApClientAddressUpdatedEvent.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL84 = SoftApClientAddressUpdatedEvent.PARSER;
                    if (prL84 != null) {
                        return prL84;
                    }
                    synchronized (SoftApClientAddressUpdatedEvent.class) {
                        prL63 = SoftApClientAddressUpdatedEvent.PARSER;
                        if (prL63 == null) {
                            SQg sQg11 = T5L.A01;
                            prL63 = C66580MXl.A0K(SoftApClientAddressUpdatedEvent.DEFAULT_INSTANCE);
                            SoftApClientAddressUpdatedEvent.PARSER = prL63;
                        }
                    }
                    return prL63;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof SetWifiPropertiesResult) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SetWifiPropertiesResult.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"status_"});
                case 3:
                    return new R5b();
                case 4:
                    return new R4F();
                case 5:
                    return SetWifiPropertiesResult.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL85 = SetWifiPropertiesResult.PARSER;
                    if (prL85 != null) {
                        return prL85;
                    }
                    synchronized (SetWifiPropertiesResult.class) {
                        prL62 = SetWifiPropertiesResult.PARSER;
                        if (prL62 == null) {
                            SQg sQg12 = T5L.A01;
                            prL62 = C66580MXl.A0K(SetWifiPropertiesResult.DEFAULT_INSTANCE);
                            SetWifiPropertiesResult.PARSER = prL62;
                        }
                    }
                    return prL62;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof SetWifiProperties) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SetWifiProperties.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"countryCode_"});
                case 3:
                    return new SetWifiProperties();
                case 4:
                    return new R4E();
                case 5:
                    return SetWifiProperties.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL86 = SetWifiProperties.PARSER;
                    if (prL86 != null) {
                        return prL86;
                    }
                    synchronized (SetWifiProperties.class) {
                        prL61 = SetWifiProperties.PARSER;
                        if (prL61 == null) {
                            SQg sQg13 = T5L.A01;
                            prL61 = C66580MXl.A0K(SetWifiProperties.DEFAULT_INSTANCE);
                            SetWifiProperties.PARSER = prL61;
                        }
                    }
                    return prL61;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof SetSessionInfo) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SetSessionInfo.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"uuid_"});
                case 3:
                    return new SetSessionInfo();
                case 4:
                    return new R4D();
                case 5:
                    return SetSessionInfo.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL87 = SetSessionInfo.PARSER;
                    if (prL87 != null) {
                        return prL87;
                    }
                    synchronized (SetSessionInfo.class) {
                        prL60 = SetSessionInfo.PARSER;
                        if (prL60 == null) {
                            SQg sQg14 = T5L.A01;
                            prL60 = C66580MXl.A0K(SetSessionInfo.DEFAULT_INSTANCE);
                            SetSessionInfo.PARSER = prL60;
                        }
                    }
                    return prL60;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof SetManifestAuthorityKey) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SetManifestAuthorityKey.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"authorityPubKey_"});
                case 3:
                    return new SetManifestAuthorityKey();
                case 4:
                    return new R4C();
                case 5:
                    return SetManifestAuthorityKey.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL88 = SetManifestAuthorityKey.PARSER;
                    if (prL88 != null) {
                        return prL88;
                    }
                    synchronized (SetManifestAuthorityKey.class) {
                        prL59 = SetManifestAuthorityKey.PARSER;
                        if (prL59 == null) {
                            SQg sQg15 = T5L.A01;
                            prL59 = C66580MXl.A0K(SetManifestAuthorityKey.DEFAULT_INSTANCE);
                            SetManifestAuthorityKey.PARSER = prL59;
                        }
                    }
                    return prL59;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof SetLinkMessage) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SetLinkMessage.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"link_"});
                case 3:
                    return new R5b();
                case 4:
                    return new R4B();
                case 5:
                    return SetLinkMessage.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL89 = SetLinkMessage.PARSER;
                    if (prL89 != null) {
                        return prL89;
                    }
                    synchronized (SetLinkMessage.class) {
                        prL58 = SetLinkMessage.PARSER;
                        if (prL58 == null) {
                            SQg sQg16 = T5L.A01;
                            prL58 = C66580MXl.A0K(SetLinkMessage.DEFAULT_INSTANCE);
                            SetLinkMessage.PARSER = prL58;
                        }
                    }
                    return prL58;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof RequestEncryption) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(RequestEncryption.DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\n\u0002\n\u0003?\u0000\u0004\u000b\u0005\u001c", new Object[]{"keyType_", "keyTypeCase_", "publicKey_", "challenge_", "supportedParameters_", "keyHint_"});
                case 3:
                    return new RequestEncryption();
                case 4:
                    return new R4A();
                case 5:
                    return RequestEncryption.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL90 = RequestEncryption.PARSER;
                    if (prL90 != null) {
                        return prL90;
                    }
                    synchronized (RequestEncryption.class) {
                        prL57 = RequestEncryption.PARSER;
                        if (prL57 == null) {
                            SQg sQg17 = T5L.A01;
                            prL57 = C66580MXl.A0K(RequestEncryption.DEFAULT_INSTANCE);
                            RequestEncryption.PARSER = prL57;
                        }
                    }
                    return prL57;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof NetworkAddress) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(NetworkAddress.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\n", new Object[]{"addressType_", "prefixLength_", "data_"});
                case 3:
                    return new NetworkAddress();
                case 4:
                    return new R49();
                case 5:
                    return NetworkAddress.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL91 = NetworkAddress.PARSER;
                    if (prL91 != null) {
                        return prL91;
                    }
                    synchronized (NetworkAddress.class) {
                        prL56 = NetworkAddress.PARSER;
                        if (prL56 == null) {
                            SQg sQg18 = T5L.A01;
                            prL56 = C66580MXl.A0K(NetworkAddress.DEFAULT_INSTANCE);
                            NetworkAddress.PARSER = prL56;
                        }
                    }
                    return prL56;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof ManifestComplete) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(ManifestComplete.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"authorityPubKey_"});
                case 3:
                    return new ManifestComplete();
                case 4:
                    return new R48();
                case 5:
                    return ManifestComplete.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL92 = ManifestComplete.PARSER;
                    if (prL92 != null) {
                        return prL92;
                    }
                    synchronized (ManifestComplete.class) {
                        prL55 = ManifestComplete.PARSER;
                        if (prL55 == null) {
                            SQg sQg19 = T5L.A01;
                            prL55 = C66580MXl.A0K(ManifestComplete.DEFAULT_INSTANCE);
                            ManifestComplete.PARSER = prL55;
                        }
                    }
                    return prL55;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof LeaveWifiDirectGroupResult) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LeaveWifiDirectGroupResult.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
                case 3:
                    return new R5b();
                case 4:
                    return new R47();
                case 5:
                    return LeaveWifiDirectGroupResult.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL93 = LeaveWifiDirectGroupResult.PARSER;
                    if (prL93 != null) {
                        return prL93;
                    }
                    synchronized (LeaveWifiDirectGroupResult.class) {
                        prL54 = LeaveWifiDirectGroupResult.PARSER;
                        if (prL54 == null) {
                            SQg sQg20 = T5L.A01;
                            prL54 = C66580MXl.A0K(LeaveWifiDirectGroupResult.DEFAULT_INSTANCE);
                            LeaveWifiDirectGroupResult.PARSER = prL54;
                        }
                    }
                    return prL54;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof LeaveWifiDirectGroup) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LeaveWifiDirectGroup.DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                case 3:
                    return new R5b();
                case 4:
                    return new R46();
                case 5:
                    return LeaveWifiDirectGroup.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL94 = LeaveWifiDirectGroup.PARSER;
                    if (prL94 != null) {
                        return prL94;
                    }
                    synchronized (LeaveWifiDirectGroup.class) {
                        prL53 = LeaveWifiDirectGroup.PARSER;
                        if (prL53 == null) {
                            SQg sQg21 = T5L.A01;
                            prL53 = C66580MXl.A0K(LeaveWifiDirectGroup.DEFAULT_INSTANCE);
                            LeaveWifiDirectGroup.PARSER = prL53;
                        }
                    }
                    return prL53;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof LeaveAccessPointResult) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LeaveAccessPointResult.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
                case 3:
                    return new R5b();
                case 4:
                    return new R45();
                case 5:
                    return LeaveAccessPointResult.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL95 = LeaveAccessPointResult.PARSER;
                    if (prL95 != null) {
                        return prL95;
                    }
                    synchronized (LeaveAccessPointResult.class) {
                        prL52 = LeaveAccessPointResult.PARSER;
                        if (prL52 == null) {
                            SQg sQg22 = T5L.A01;
                            prL52 = C66580MXl.A0K(LeaveAccessPointResult.DEFAULT_INSTANCE);
                            LeaveAccessPointResult.PARSER = prL52;
                        }
                    }
                    return prL52;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof LeaveAccessPoint) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LeaveAccessPoint.DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                case 3:
                    return new R5b();
                case 4:
                    return new R44();
                case 5:
                    return LeaveAccessPoint.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL96 = LeaveAccessPoint.PARSER;
                    if (prL96 != null) {
                        return prL96;
                    }
                    synchronized (LeaveAccessPoint.class) {
                        prL51 = LeaveAccessPoint.PARSER;
                        if (prL51 == null) {
                            SQg sQg23 = T5L.A01;
                            prL51 = C66580MXl.A0K(LeaveAccessPoint.DEFAULT_INSTANCE);
                            LeaveAccessPoint.PARSER = prL51;
                        }
                    }
                    return prL51;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof LePairingInfo) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LePairingInfo.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"appearance_"});
                case 3:
                    return new R5b();
                case 4:
                    return new R43();
                case 5:
                    return LePairingInfo.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL97 = LePairingInfo.PARSER;
                    if (prL97 != null) {
                        return prL97;
                    }
                    synchronized (LePairingInfo.class) {
                        prL50 = LePairingInfo.PARSER;
                        if (prL50 == null) {
                            SQg sQg24 = T5L.A01;
                            prL50 = C66580MXl.A0K(LePairingInfo.DEFAULT_INSTANCE);
                            LePairingInfo.PARSER = prL50;
                        }
                    }
                    return prL50;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof JoinWifiDirectGroupResult) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(JoinWifiDirectGroupResult.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003\u000b", new Object[]{"status_", "addresses_", NetworkAddress.class, "portNumber_"});
                case 3:
                    return new JoinWifiDirectGroupResult();
                case 4:
                    return new R42();
                case 5:
                    return JoinWifiDirectGroupResult.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL98 = JoinWifiDirectGroupResult.PARSER;
                    if (prL98 != null) {
                        return prL98;
                    }
                    synchronized (JoinWifiDirectGroupResult.class) {
                        prL49 = JoinWifiDirectGroupResult.PARSER;
                        if (prL49 == null) {
                            SQg sQg25 = T5L.A01;
                            prL49 = C66580MXl.A0K(JoinWifiDirectGroupResult.DEFAULT_INSTANCE);
                            JoinWifiDirectGroupResult.PARSER = prL49;
                        }
                    }
                    return prL49;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof JoinWifiDirectGroup) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(JoinWifiDirectGroup.DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u001b\u0005\t\u0006\n\u0007\u0004\b\f", new Object[]{"ssid_", "passphrase_", "timeout_", "clientAddresses_", NetworkAddress.class, "ownerAddress_", "uuid_", "frequency_", "bandwidth_"});
                case 3:
                    return new JoinWifiDirectGroup();
                case 4:
                    return new R41();
                case 5:
                    return JoinWifiDirectGroup.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL99 = JoinWifiDirectGroup.PARSER;
                    if (prL99 != null) {
                        return prL99;
                    }
                    synchronized (JoinWifiDirectGroup.class) {
                        prL48 = JoinWifiDirectGroup.PARSER;
                        if (prL48 == null) {
                            SQg sQg26 = T5L.A01;
                            prL48 = C66580MXl.A0K(JoinWifiDirectGroup.DEFAULT_INSTANCE);
                            JoinWifiDirectGroup.PARSER = prL48;
                        }
                    }
                    return prL48;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof JoinAccessPointResult) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(JoinAccessPointResult.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003\u000b", new Object[]{"status_", "addresses_", NetworkAddress.class, "portNumber_"});
                case 3:
                    return new JoinAccessPointResult();
                case 4:
                    return new R40();
                case 5:
                    return JoinAccessPointResult.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL100 = JoinAccessPointResult.PARSER;
                    if (prL100 != null) {
                        return prL100;
                    }
                    synchronized (JoinAccessPointResult.class) {
                        prL47 = JoinAccessPointResult.PARSER;
                        if (prL47 == null) {
                            SQg sQg27 = T5L.A01;
                            prL47 = C66580MXl.A0K(JoinAccessPointResult.DEFAULT_INSTANCE);
                            JoinAccessPointResult.PARSER = prL47;
                        }
                    }
                    return prL47;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof JoinAccessPoint) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(JoinAccessPoint.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0004\f", new Object[]{"ssid_", "passphrase_", "uuid_", "bandwidth_"});
                case 3:
                    return new JoinAccessPoint();
                case 4:
                    return new C8739R3z();
                case 5:
                    return JoinAccessPoint.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL101 = JoinAccessPoint.PARSER;
                    if (prL101 != null) {
                        return prL101;
                    }
                    synchronized (JoinAccessPoint.class) {
                        prL46 = JoinAccessPoint.PARSER;
                        if (prL46 == null) {
                            SQg sQg28 = T5L.A01;
                            prL46 = C66580MXl.A0K(JoinAccessPoint.DEFAULT_INSTANCE);
                            JoinAccessPoint.PARSER = prL46;
                        }
                    }
                    return prL46;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof EndWifiSession) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(EndWifiSession.DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                case 3:
                    return new R5b();
                case 4:
                    return new C8738R3y();
                case 5:
                    return EndWifiSession.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL102 = EndWifiSession.PARSER;
                    if (prL102 != null) {
                        return prL102;
                    }
                    synchronized (EndWifiSession.class) {
                        prL45 = EndWifiSession.PARSER;
                        if (prL45 == null) {
                            SQg sQg29 = T5L.A01;
                            prL45 = C66580MXl.A0K(EndWifiSession.DEFAULT_INSTANCE);
                            EndWifiSession.PARSER = prL45;
                        }
                    }
                    return prL45;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof EndLinkSetup) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(EndLinkSetup.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"state_", "uuid_"});
                case 3:
                    return new EndLinkSetup();
                case 4:
                    return new C8737R3x();
                case 5:
                    return EndLinkSetup.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL103 = EndLinkSetup.PARSER;
                    if (prL103 != null) {
                        return prL103;
                    }
                    synchronized (EndLinkSetup.class) {
                        prL44 = EndLinkSetup.PARSER;
                        if (prL44 == null) {
                            SQg sQg30 = T5L.A01;
                            prL44 = C66580MXl.A0K(EndLinkSetup.DEFAULT_INSTANCE);
                            EndLinkSetup.PARSER = prL44;
                        }
                    }
                    return prL44;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof EnableEncryption) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(EnableEncryption.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\u000b\u0005\u000b", new Object[]{"publicKey_", "seed_", "iv_", "base_", "parameters_"});
                case 3:
                    return new EnableEncryption();
                case 4:
                    return new C8736R3w();
                case 5:
                    return EnableEncryption.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL104 = EnableEncryption.PARSER;
                    if (prL104 != null) {
                        return prL104;
                    }
                    synchronized (EnableEncryption.class) {
                        prL43 = EnableEncryption.PARSER;
                        if (prL43 == null) {
                            SQg sQg31 = T5L.A01;
                            prL43 = C66580MXl.A0K(EnableEncryption.DEFAULT_INSTANCE);
                            EnableEncryption.PARSER = prL43;
                        }
                    }
                    return prL43;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof DestroyWifiDirectNetworkResult) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(DestroyWifiDirectNetworkResult.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
                case 3:
                    return new R5b();
                case 4:
                    return new C8735R3v();
                case 5:
                    return DestroyWifiDirectNetworkResult.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL105 = DestroyWifiDirectNetworkResult.PARSER;
                    if (prL105 != null) {
                        return prL105;
                    }
                    synchronized (DestroyWifiDirectNetworkResult.class) {
                        prL42 = DestroyWifiDirectNetworkResult.PARSER;
                        if (prL42 == null) {
                            SQg sQg32 = T5L.A01;
                            prL42 = C66580MXl.A0K(DestroyWifiDirectNetworkResult.DEFAULT_INSTANCE);
                            DestroyWifiDirectNetworkResult.PARSER = prL42;
                        }
                    }
                    return prL42;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof DestroyWifiDirectNetwork) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(DestroyWifiDirectNetwork.DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                case 3:
                    return new R5b();
                case 4:
                    return new C8734R3u();
                case 5:
                    return DestroyWifiDirectNetwork.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL106 = DestroyWifiDirectNetwork.PARSER;
                    if (prL106 != null) {
                        return prL106;
                    }
                    synchronized (DestroyWifiDirectNetwork.class) {
                        prL41 = DestroyWifiDirectNetwork.PARSER;
                        if (prL41 == null) {
                            SQg sQg33 = T5L.A01;
                            prL41 = C66580MXl.A0K(DestroyWifiDirectNetwork.DEFAULT_INSTANCE);
                            DestroyWifiDirectNetwork.PARSER = prL41;
                        }
                    }
                    return prL41;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof DestroySoftApNetworkResult) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(DestroySoftApNetworkResult.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
                case 3:
                    return new R5b();
                case 4:
                    return new C8733R3t();
                case 5:
                    return DestroySoftApNetworkResult.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL107 = DestroySoftApNetworkResult.PARSER;
                    if (prL107 != null) {
                        return prL107;
                    }
                    synchronized (DestroySoftApNetworkResult.class) {
                        prL40 = DestroySoftApNetworkResult.PARSER;
                        if (prL40 == null) {
                            SQg sQg34 = T5L.A01;
                            prL40 = C66580MXl.A0K(DestroySoftApNetworkResult.DEFAULT_INSTANCE);
                            DestroySoftApNetworkResult.PARSER = prL40;
                        }
                    }
                    return prL40;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof DestroySoftApNetwork) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(DestroySoftApNetwork.DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                case 3:
                    return new R5b();
                case 4:
                    return new C8732R3s();
                case 5:
                    return DestroySoftApNetwork.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL108 = DestroySoftApNetwork.PARSER;
                    if (prL108 != null) {
                        return prL108;
                    }
                    synchronized (DestroySoftApNetwork.class) {
                        prL39 = DestroySoftApNetwork.PARSER;
                        if (prL39 == null) {
                            SQg sQg35 = T5L.A01;
                            prL39 = C66580MXl.A0K(DestroySoftApNetwork.DEFAULT_INSTANCE);
                            DestroySoftApNetwork.PARSER = prL39;
                        }
                    }
                    return prL39;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof CreateWifiDirectNetwork) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(CreateWifiDirectNetwork.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"band_", "uuid_"});
                case 3:
                    return new CreateWifiDirectNetwork();
                case 4:
                    return new C8731R3r();
                case 5:
                    return CreateWifiDirectNetwork.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL109 = CreateWifiDirectNetwork.PARSER;
                    if (prL109 != null) {
                        return prL109;
                    }
                    synchronized (CreateWifiDirectNetwork.class) {
                        prL38 = CreateWifiDirectNetwork.PARSER;
                        if (prL38 == null) {
                            SQg sQg36 = T5L.A01;
                            prL38 = C66580MXl.A0K(CreateWifiDirectNetwork.DEFAULT_INSTANCE);
                            CreateWifiDirectNetwork.PARSER = prL38;
                        }
                    }
                    return prL38;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof CreateSoftApNetwork) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(CreateSoftApNetwork.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0003\t\u0007\u0000\u0000\u0000\u0003\f\u0004\u000b\u0005\u0007\u0006Ȉ\u0007\n\b\t\t\f", new Object[]{"band_", "channel_", "hidden_", "countryCode_", "uuid_", "credentials_", "bandwidth_"});
                case 3:
                    return new CreateSoftApNetwork();
                case 4:
                    return new C8730R3q();
                case 5:
                    return CreateSoftApNetwork.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL110 = CreateSoftApNetwork.PARSER;
                    if (prL110 != null) {
                        return prL110;
                    }
                    synchronized (CreateSoftApNetwork.class) {
                        prL37 = CreateSoftApNetwork.PARSER;
                        if (prL37 == null) {
                            SQg sQg37 = T5L.A01;
                            prL37 = C66580MXl.A0K(CreateSoftApNetwork.DEFAULT_INSTANCE);
                            CreateSoftApNetwork.PARSER = prL37;
                        }
                    }
                    return prL37;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof UnlinkAppResponse) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(UnlinkAppResponse.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\f", new Object[]{"nonce_", "error_"});
                case 3:
                    return new R5b();
                case 4:
                    return new C8729R3p();
                case 5:
                    return UnlinkAppResponse.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL111 = UnlinkAppResponse.PARSER;
                    if (prL111 != null) {
                        return prL111;
                    }
                    synchronized (UnlinkAppResponse.class) {
                        prL36 = UnlinkAppResponse.PARSER;
                        if (prL36 == null) {
                            SQg sQg38 = T5L.A01;
                            prL36 = C66580MXl.A0K(UnlinkAppResponse.DEFAULT_INSTANCE);
                            UnlinkAppResponse.PARSER = prL36;
                        }
                    }
                    return prL36;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof UnlinkAppRequest) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(UnlinkAppRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"nonce_", "serviceUUID_"});
                case 3:
                    return new UnlinkAppRequest();
                case 4:
                    return new C8728R3o();
                case 5:
                    return UnlinkAppRequest.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL112 = UnlinkAppRequest.PARSER;
                    if (prL112 != null) {
                        return prL112;
                    }
                    synchronized (UnlinkAppRequest.class) {
                        prL35 = UnlinkAppRequest.PARSER;
                        if (prL35 == null) {
                            SQg sQg39 = T5L.A01;
                            prL35 = C66580MXl.A0K(UnlinkAppRequest.DEFAULT_INSTANCE);
                            UnlinkAppRequest.PARSER = prL35;
                        }
                    }
                    return prL35;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof LinkedAppDisconnectedEvent) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkedAppDisconnectedEvent.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"serviceUUID_"});
                case 3:
                    return new LinkedAppDisconnectedEvent();
                case 4:
                    return new C8727R3n();
                case 5:
                    return LinkedAppDisconnectedEvent.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL113 = LinkedAppDisconnectedEvent.PARSER;
                    if (prL113 != null) {
                        return prL113;
                    }
                    synchronized (LinkedAppDisconnectedEvent.class) {
                        prL34 = LinkedAppDisconnectedEvent.PARSER;
                        if (prL34 == null) {
                            SQg sQg40 = T5L.A01;
                            prL34 = C66580MXl.A0K(LinkedAppDisconnectedEvent.DEFAULT_INSTANCE);
                            LinkedAppDisconnectedEvent.PARSER = prL34;
                        }
                    }
                    return prL34;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof LinkedAppConnectedEvent) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkedAppConnectedEvent.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"serviceUUID_"});
                case 3:
                    return new LinkedAppConnectedEvent();
                case 4:
                    return new C8726R3m();
                case 5:
                    return LinkedAppConnectedEvent.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL114 = LinkedAppConnectedEvent.PARSER;
                    if (prL114 != null) {
                        return prL114;
                    }
                    synchronized (LinkedAppConnectedEvent.class) {
                        prL33 = LinkedAppConnectedEvent.PARSER;
                        if (prL33 == null) {
                            SQg sQg41 = T5L.A01;
                            prL33 = C66580MXl.A0K(LinkedAppConnectedEvent.DEFAULT_INSTANCE);
                            LinkedAppConnectedEvent.PARSER = prL33;
                        }
                    }
                    return prL33;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof LinkAppResponse) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAppResponse.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\n", new Object[]{"nonce_", "error_", "devicePublicKey_"});
                case 3:
                    return new LinkAppResponse();
                case 4:
                    return new C8725R3l();
                case 5:
                    return LinkAppResponse.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL115 = LinkAppResponse.PARSER;
                    if (prL115 != null) {
                        return prL115;
                    }
                    synchronized (LinkAppResponse.class) {
                        prL32 = LinkAppResponse.PARSER;
                        if (prL32 == null) {
                            SQg sQg42 = T5L.A01;
                            prL32 = C66580MXl.A0K(LinkAppResponse.DEFAULT_INSTANCE);
                            LinkAppResponse.PARSER = prL32;
                        }
                    }
                    return prL32;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof LinkAppRequest) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAppRequest.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\n\u0004Ȉ", new Object[]{"nonce_", "serviceUUID_", "appPublicKey_", "bundleIdentifier_"});
                case 3:
                    return new LinkAppRequest();
                case 4:
                    return new C8724R3k();
                case 5:
                    return LinkAppRequest.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL116 = LinkAppRequest.PARSER;
                    if (prL116 != null) {
                        return prL116;
                    }
                    synchronized (LinkAppRequest.class) {
                        prL31 = LinkAppRequest.PARSER;
                        if (prL31 == null) {
                            SQg sQg43 = T5L.A01;
                            prL31 = C66580MXl.A0K(LinkAppRequest.DEFAULT_INSTANCE);
                            LinkAppRequest.PARSER = prL31;
                        }
                    }
                    return prL31;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof LinkAppRegisterResponse) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAppRegisterResponse.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\n", new Object[]{"nonce_", "error_", "serviceUUID_"});
                case 3:
                    return new LinkAppRegisterResponse();
                case 4:
                    return new C8723R3j();
                case 5:
                    return LinkAppRegisterResponse.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL117 = LinkAppRegisterResponse.PARSER;
                    if (prL117 != null) {
                        return prL117;
                    }
                    synchronized (LinkAppRegisterResponse.class) {
                        prL30 = LinkAppRegisterResponse.PARSER;
                        if (prL30 == null) {
                            SQg sQg44 = T5L.A01;
                            prL30 = C66580MXl.A0K(LinkAppRegisterResponse.DEFAULT_INSTANCE);
                            LinkAppRegisterResponse.PARSER = prL30;
                        }
                    }
                    return prL30;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof LinkAppLinkInfoResponse) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAppLinkInfoResponse.DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u000b\u0002\f\u0003\u001b\u0004\n\u0005\n\u0006\n\u0007\n\b\n\t\n\n\n\u000b\n", new Object[]{"nonce_", "error_", "addresses_", LinkAddress.class, "firmwareVersion_", "deviceSerial_", "deviceImageAssetURI_", "deviceModelName_", "buildFlavor_", "deviceName_", "hardwareType_", "macAddress_"});
                case 3:
                    return new LinkAppLinkInfoResponse();
                case 4:
                    return new C8721R3h();
                case 5:
                    return LinkAppLinkInfoResponse.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL118 = LinkAppLinkInfoResponse.PARSER;
                    if (prL118 != null) {
                        return prL118;
                    }
                    synchronized (LinkAppLinkInfoResponse.class) {
                        prL29 = LinkAppLinkInfoResponse.PARSER;
                        if (prL29 == null) {
                            SQg sQg45 = T5L.A01;
                            prL29 = C66580MXl.A0K(LinkAppLinkInfoResponse.DEFAULT_INSTANCE);
                            LinkAppLinkInfoResponse.PARSER = prL29;
                        }
                    }
                    return prL29;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof LinkAppDeviceIdentityResponse) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAppDeviceIdentityResponse.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\n\u0004\n", new Object[]{"nonce_", "error_", "serviceUUID_", "devicePublicKey_"});
                case 3:
                    return new LinkAppDeviceIdentityResponse();
                case 4:
                    return new C8719R3f();
                case 5:
                    return LinkAppDeviceIdentityResponse.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL119 = LinkAppDeviceIdentityResponse.PARSER;
                    if (prL119 != null) {
                        return prL119;
                    }
                    synchronized (LinkAppDeviceIdentityResponse.class) {
                        prL28 = LinkAppDeviceIdentityResponse.PARSER;
                        if (prL28 == null) {
                            SQg sQg46 = T5L.A01;
                            prL28 = C66580MXl.A0K(LinkAppDeviceIdentityResponse.DEFAULT_INSTANCE);
                            LinkAppDeviceIdentityResponse.PARSER = prL28;
                        }
                    }
                    return prL28;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof LinkAddress) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAddress.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\n", new Object[]{"addressType_", "prefixLength_", "data_"});
                case 3:
                    return new LinkAddress();
                case 4:
                    return new C8717R3d();
                case 5:
                    return LinkAddress.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL120 = LinkAddress.PARSER;
                    if (prL120 != null) {
                        return prL120;
                    }
                    synchronized (LinkAddress.class) {
                        prL27 = LinkAddress.PARSER;
                        if (prL27 == null) {
                            SQg sQg47 = T5L.A01;
                            prL27 = C66580MXl.A0K(LinkAddress.DEFAULT_INSTANCE);
                            LinkAddress.PARSER = prL27;
                        }
                    }
                    return prL27;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Value) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Value.DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
                case 3:
                    return new Value();
                case 4:
                    return new C8716R3c();
                case 5:
                    return Value.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL121 = Value.PARSER;
                    if (prL121 != null) {
                        return prL121;
                    }
                    synchronized (Value.class) {
                        prL26 = Value.PARSER;
                        if (prL26 == null) {
                            SQg sQg48 = T5L.A01;
                            prL26 = C66580MXl.A0K(Value.DEFAULT_INSTANCE);
                            Value.PARSER = prL26;
                        }
                    }
                    return prL26;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof UInt64Value) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(UInt64Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", Pxh.A1Z());
                case 3:
                    return new R5b();
                case 4:
                    return new C8715R3b();
                case 5:
                    return UInt64Value.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL122 = UInt64Value.PARSER;
                    if (prL122 != null) {
                        return prL122;
                    }
                    synchronized (UInt64Value.class) {
                        prL25 = UInt64Value.PARSER;
                        if (prL25 == null) {
                            SQg sQg49 = T5L.A01;
                            prL25 = C66580MXl.A0K(UInt64Value.DEFAULT_INSTANCE);
                            UInt64Value.PARSER = prL25;
                        }
                    }
                    return prL25;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof UInt32Value) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(UInt32Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", Pxh.A1Z());
                case 3:
                    return new R5b();
                case 4:
                    return new C8714R3a();
                case 5:
                    return UInt32Value.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL123 = UInt32Value.PARSER;
                    if (prL123 != null) {
                        return prL123;
                    }
                    synchronized (UInt32Value.class) {
                        prL24 = UInt32Value.PARSER;
                        if (prL24 == null) {
                            SQg sQg50 = T5L.A01;
                            prL24 = C66580MXl.A0K(UInt32Value.DEFAULT_INSTANCE);
                            UInt32Value.PARSER = prL24;
                        }
                    }
                    return prL24;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Type) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Type.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_"});
                case 3:
                    return new Type();
                case 4:
                    return new R3Z();
                case 5:
                    return Type.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL124 = Type.PARSER;
                    if (prL124 != null) {
                        return prL124;
                    }
                    synchronized (Type.class) {
                        prL23 = Type.PARSER;
                        if (prL23 == null) {
                            SQg sQg51 = T5L.A01;
                            prL23 = C66580MXl.A0K(Type.DEFAULT_INSTANCE);
                            Type.PARSER = prL23;
                        }
                    }
                    return prL23;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Timestamp) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Timestamp.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
                case 3:
                    return new R5b();
                case 4:
                    return new R3Y();
                case 5:
                    return Timestamp.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL125 = Timestamp.PARSER;
                    if (prL125 != null) {
                        return prL125;
                    }
                    synchronized (Timestamp.class) {
                        prL22 = Timestamp.PARSER;
                        if (prL22 == null) {
                            SQg sQg52 = T5L.A01;
                            prL22 = C66580MXl.A0K(Timestamp.DEFAULT_INSTANCE);
                            Timestamp.PARSER = prL22;
                        }
                    }
                    return prL22;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Struct) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Struct.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", C10018RlD.A00});
                case 3:
                    return new Struct();
                case 4:
                    return new R3X();
                case 5:
                    return Struct.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL126 = Struct.PARSER;
                    if (prL126 != null) {
                        return prL126;
                    }
                    synchronized (Struct.class) {
                        prL21 = Struct.PARSER;
                        if (prL21 == null) {
                            SQg sQg53 = T5L.A01;
                            prL21 = C66580MXl.A0K(Struct.DEFAULT_INSTANCE);
                            Struct.PARSER = prL21;
                        }
                    }
                    return prL21;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof StringValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(StringValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", Pxh.A1Z());
                case 3:
                    return new StringValue();
                case 4:
                    return new R3W();
                case 5:
                    return StringValue.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL127 = StringValue.PARSER;
                    if (prL127 != null) {
                        return prL127;
                    }
                    synchronized (StringValue.class) {
                        prL20 = StringValue.PARSER;
                        if (prL20 == null) {
                            SQg sQg54 = T5L.A01;
                            prL20 = C66580MXl.A0K(StringValue.DEFAULT_INSTANCE);
                            StringValue.PARSER = prL20;
                        }
                    }
                    return prL20;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof SourceContext) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SourceContext.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
                case 3:
                    return new SourceContext();
                case 4:
                    return new R3V();
                case 5:
                    return SourceContext.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL128 = SourceContext.PARSER;
                    if (prL128 != null) {
                        return prL128;
                    }
                    synchronized (SourceContext.class) {
                        prL19 = SourceContext.PARSER;
                        if (prL19 == null) {
                            SQg sQg55 = T5L.A01;
                            prL19 = C66580MXl.A0K(SourceContext.DEFAULT_INSTANCE);
                            SourceContext.PARSER = prL19;
                        }
                    }
                    return prL19;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Option) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Option.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
                case 3:
                    return new Option();
                case 4:
                    return new R3U();
                case 5:
                    return Option.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL129 = Option.PARSER;
                    if (prL129 != null) {
                        return prL129;
                    }
                    synchronized (Option.class) {
                        prL18 = Option.PARSER;
                        if (prL18 == null) {
                            SQg sQg56 = T5L.A01;
                            prL18 = C66580MXl.A0K(Option.DEFAULT_INSTANCE);
                            Option.PARSER = prL18;
                        }
                    }
                    return prL18;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Mixin) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Mixin.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
                case 3:
                    return new Mixin();
                case 4:
                    return new R3T();
                case 5:
                    return Mixin.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL130 = Mixin.PARSER;
                    if (prL130 != null) {
                        return prL130;
                    }
                    synchronized (Mixin.class) {
                        prL17 = Mixin.PARSER;
                        if (prL17 == null) {
                            SQg sQg57 = T5L.A01;
                            prL17 = C66580MXl.A0K(Mixin.DEFAULT_INSTANCE);
                            Mixin.PARSER = prL17;
                        }
                    }
                    return prL17;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof com.google.protobuf.Method) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(com.google.protobuf.Method.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Option.class, "syntax_"});
                case 3:
                    return new com.google.protobuf.Method();
                case 4:
                    return new R3S();
                case 5:
                    return com.google.protobuf.Method.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL131 = com.google.protobuf.Method.PARSER;
                    if (prL131 != null) {
                        return prL131;
                    }
                    synchronized (com.google.protobuf.Method.class) {
                        prL16 = com.google.protobuf.Method.PARSER;
                        if (prL16 == null) {
                            SQg sQg58 = T5L.A01;
                            prL16 = C66580MXl.A0K(com.google.protobuf.Method.DEFAULT_INSTANCE);
                            com.google.protobuf.Method.PARSER = prL16;
                        }
                    }
                    return prL16;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof ListValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(ListValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
                case 3:
                    return new ListValue();
                case 4:
                    return new R3R();
                case 5:
                    return ListValue.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL132 = ListValue.PARSER;
                    if (prL132 != null) {
                        return prL132;
                    }
                    synchronized (ListValue.class) {
                        prL15 = ListValue.PARSER;
                        if (prL15 == null) {
                            SQg sQg59 = T5L.A01;
                            prL15 = C66580MXl.A0K(ListValue.DEFAULT_INSTANCE);
                            ListValue.PARSER = prL15;
                        }
                    }
                    return prL15;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Int64Value) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Int64Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", Pxh.A1Z());
                case 3:
                    return new R5b();
                case 4:
                    return new R3Q();
                case 5:
                    return Int64Value.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL133 = Int64Value.PARSER;
                    if (prL133 != null) {
                        return prL133;
                    }
                    synchronized (Int64Value.class) {
                        prL14 = Int64Value.PARSER;
                        if (prL14 == null) {
                            SQg sQg60 = T5L.A01;
                            prL14 = C66580MXl.A0K(Int64Value.DEFAULT_INSTANCE);
                            Int64Value.PARSER = prL14;
                        }
                    }
                    return prL14;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Int32Value) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Int32Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", Pxh.A1Z());
                case 3:
                    return new R5b();
                case 4:
                    return new R3P();
                case 5:
                    return Int32Value.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL134 = Int32Value.PARSER;
                    if (prL134 != null) {
                        return prL134;
                    }
                    synchronized (Int32Value.class) {
                        prL13 = Int32Value.PARSER;
                        if (prL13 == null) {
                            SQg sQg61 = T5L.A01;
                            prL13 = C66580MXl.A0K(Int32Value.DEFAULT_INSTANCE);
                            Int32Value.PARSER = prL13;
                        }
                    }
                    return prL13;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof FloatValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(FloatValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", Pxh.A1Z());
                case 3:
                    return new R5b();
                case 4:
                    return new R3O();
                case 5:
                    return FloatValue.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL135 = FloatValue.PARSER;
                    if (prL135 != null) {
                        return prL135;
                    }
                    synchronized (FloatValue.class) {
                        prL12 = FloatValue.PARSER;
                        if (prL12 == null) {
                            SQg sQg62 = T5L.A01;
                            prL12 = C66580MXl.A0K(FloatValue.DEFAULT_INSTANCE);
                            FloatValue.PARSER = prL12;
                        }
                    }
                    return prL12;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof FieldMask) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(FieldMask.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
                case 3:
                    return new FieldMask();
                case 4:
                    return new R3N();
                case 5:
                    return FieldMask.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL136 = FieldMask.PARSER;
                    if (prL136 != null) {
                        return prL136;
                    }
                    synchronized (FieldMask.class) {
                        prL11 = FieldMask.PARSER;
                        if (prL11 == null) {
                            SQg sQg63 = T5L.A01;
                            prL11 = C66580MXl.A0K(FieldMask.DEFAULT_INSTANCE);
                            FieldMask.PARSER = prL11;
                        }
                    }
                    return prL11;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Field) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Field.DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
                case 3:
                    return new Field();
                case 4:
                    return new R3M();
                case 5:
                    return Field.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL137 = Field.PARSER;
                    if (prL137 != null) {
                        return prL137;
                    }
                    synchronized (Field.class) {
                        prL10 = Field.PARSER;
                        if (prL10 == null) {
                            SQg sQg64 = T5L.A01;
                            prL10 = C66580MXl.A0K(Field.DEFAULT_INSTANCE);
                            Field.PARSER = prL10;
                        }
                    }
                    return prL10;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof EnumValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(EnumValue.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", Option.class});
                case 3:
                    return new EnumValue();
                case 4:
                    return new R3L();
                case 5:
                    return EnumValue.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL138 = EnumValue.PARSER;
                    if (prL138 != null) {
                        return prL138;
                    }
                    synchronized (EnumValue.class) {
                        prL9 = EnumValue.PARSER;
                        if (prL9 == null) {
                            SQg sQg65 = T5L.A01;
                            prL9 = C66580MXl.A0K(EnumValue.DEFAULT_INSTANCE);
                            EnumValue.PARSER = prL9;
                        }
                    }
                    return prL9;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Enum) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Enum.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_"});
                case 3:
                    return new Enum();
                case 4:
                    return new R3K();
                case 5:
                    return Enum.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL139 = Enum.PARSER;
                    if (prL139 != null) {
                        return prL139;
                    }
                    synchronized (Enum.class) {
                        prL8 = Enum.PARSER;
                        if (prL8 == null) {
                            SQg sQg66 = T5L.A01;
                            prL8 = C66580MXl.A0K(Enum.DEFAULT_INSTANCE);
                            Enum.PARSER = prL8;
                        }
                    }
                    return prL8;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Empty) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Empty.DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                case 3:
                    return new R5b();
                case 4:
                    return new R3J();
                case 5:
                    return Empty.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL140 = Empty.PARSER;
                    if (prL140 != null) {
                        return prL140;
                    }
                    synchronized (Empty.class) {
                        prL7 = Empty.PARSER;
                        if (prL7 == null) {
                            SQg sQg67 = T5L.A01;
                            prL7 = C66580MXl.A0K(Empty.DEFAULT_INSTANCE);
                            Empty.PARSER = prL7;
                        }
                    }
                    return prL7;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Duration) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Duration.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
                case 3:
                    return new R5b();
                case 4:
                    return new R3I();
                case 5:
                    return Duration.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL141 = Duration.PARSER;
                    if (prL141 != null) {
                        return prL141;
                    }
                    synchronized (Duration.class) {
                        prL6 = Duration.PARSER;
                        if (prL6 == null) {
                            SQg sQg68 = T5L.A01;
                            prL6 = C66580MXl.A0K(Duration.DEFAULT_INSTANCE);
                            Duration.PARSER = prL6;
                        }
                    }
                    return prL6;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof DoubleValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(DoubleValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", Pxh.A1Z());
                case 3:
                    return new R5b();
                case 4:
                    return new R3H();
                case 5:
                    return DoubleValue.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL142 = DoubleValue.PARSER;
                    if (prL142 != null) {
                        return prL142;
                    }
                    synchronized (DoubleValue.class) {
                        prL5 = DoubleValue.PARSER;
                        if (prL5 == null) {
                            SQg sQg69 = T5L.A01;
                            prL5 = C66580MXl.A0K(DoubleValue.DEFAULT_INSTANCE);
                            DoubleValue.PARSER = prL5;
                        }
                    }
                    return prL5;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof BytesValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(BytesValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", Pxh.A1Z());
                case 3:
                    return new BytesValue();
                case 4:
                    return new R3G();
                case 5:
                    return BytesValue.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL143 = BytesValue.PARSER;
                    if (prL143 != null) {
                        return prL143;
                    }
                    synchronized (BytesValue.class) {
                        prL4 = BytesValue.PARSER;
                        if (prL4 == null) {
                            SQg sQg70 = T5L.A01;
                            prL4 = C66580MXl.A0K(BytesValue.DEFAULT_INSTANCE);
                            BytesValue.PARSER = prL4;
                        }
                    }
                    return prL4;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof BoolValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(BoolValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", Pxh.A1Z());
                case 3:
                    return new R5b();
                case 4:
                    return new R3F();
                case 5:
                    return BoolValue.DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL144 = BoolValue.PARSER;
                    if (prL144 != null) {
                        return prL144;
                    }
                    synchronized (BoolValue.class) {
                        prL3 = BoolValue.PARSER;
                        if (prL3 == null) {
                            SQg sQg71 = T5L.A01;
                            prL3 = C66580MXl.A0K(BoolValue.DEFAULT_INSTANCE);
                            BoolValue.PARSER = prL3;
                        }
                    }
                    return prL3;
                default:
                    throw C66580MXl.A11();
            }
        } else {
            boolean z = this instanceof Api;
            int intValue = num.intValue();
            if (z) {
                switch (intValue) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return A07(Api.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", com.google.protobuf.Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"});
                    case 3:
                        return new Api();
                    case 4:
                        return new R3E();
                    case 5:
                        return Api.DEFAULT_INSTANCE;
                    case 6:
                        C74232PrL prL145 = Api.PARSER;
                        if (prL145 != null) {
                            return prL145;
                        }
                        synchronized (Api.class) {
                            prL2 = Api.PARSER;
                            if (prL2 == null) {
                                SQg sQg72 = T5L.A01;
                                prL2 = C66580MXl.A0K(Api.DEFAULT_INSTANCE);
                                Api.PARSER = prL2;
                            }
                        }
                        return prL2;
                    default:
                        throw C66580MXl.A11();
                }
            } else {
                switch (intValue) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return A07(Any.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
                    case 3:
                        return new Any();
                    case 4:
                        return new R3D();
                    case 5:
                        return Any.DEFAULT_INSTANCE;
                    case 6:
                        C74232PrL prL146 = Any.PARSER;
                        if (prL146 != null) {
                            return prL146;
                        }
                        synchronized (Any.class) {
                            prL = Any.PARSER;
                            if (prL == null) {
                                SQg sQg73 = T5L.A01;
                                prL = C66580MXl.A0K(Any.DEFAULT_INSTANCE);
                                Any.PARSER = prL;
                            }
                        }
                        return prL;
                    default:
                        throw C66580MXl.A11();
                }
            }
        }
    }
}
