package X;

/* renamed from: X.RnG  reason: case insensitive filesystem */
public abstract class C10139RnG {
    public static final C11230SGo A00;
    public static final C11230SGo A01;
    public static final C11230SGo A02;
    public static final C11230SGo A03 = C11230SGo.A00("Google Play In-app Billing API version is less than 9", 3);
    public static final C11230SGo A04 = C11230SGo.A00("Billing service unavailable on device.", 3);
    public static final C11230SGo A05;
    public static final C11230SGo A06 = C11230SGo.A00("The list of SKUs can't be empty.", 5);
    public static final C11230SGo A07 = C11230SGo.A00("SKU type can't be empty.", 5);
    public static final C11230SGo A08 = C11230SGo.A00("Product type can't be empty.", 5);
    public static final C11230SGo A09;
    public static final C11230SGo A0A;
    public static final C11230SGo A0B;
    public static final C11230SGo A0C;
    public static final C11230SGo A0D;
    public static final C11230SGo A0E;
    public static final C11230SGo A0F;
    public static final C11230SGo A0G = C11230SGo.A00("Client does not support get purchase history.", -2);
    public static final C11230SGo A0H = C11230SGo.A00("Client does not support multi-item purchases.", -2);
    public static final C11230SGo A0I = C11230SGo.A00("Client does not support offer_id_token.", -2);
    public static final C11230SGo A0J = C11230SGo.A00("Client does not support ProductDetails.", -2);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.SGo] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.SGo] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.SGo] */
    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object, X.SGo] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, X.SGo] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, X.SGo] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object, X.SGo] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, X.SGo] */
    /* JADX WARNING: type inference failed for: r0v18, types: [java.lang.Object, X.SGo] */
    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object, X.SGo] */
    /* JADX WARNING: type inference failed for: r1v10, types: [java.lang.Object, X.SGo] */
    static {
        ? obj = new Object();
        obj.A00 = 3;
        obj.A01 = "Google Play In-app Billing API version is less than 3";
        A02 = obj;
        ? obj2 = new Object();
        obj2.A00 = 5;
        obj2.A01 = "Client is already in the process of connecting to billing service.";
        A05 = obj2;
        ? obj3 = new Object();
        obj3.A00 = -2;
        obj3.A01 = "Client does not support extra params.";
        A09 = obj3;
        ? obj4 = new Object();
        obj4.A00 = 5;
        obj4.A01 = "Invalid purchase token.";
        A0A = obj4;
        ? obj5 = new Object();
        obj5.A00 = 6;
        obj5.A01 = "An internal error occurred.";
        A0B = obj5;
        ? obj6 = new Object();
        obj6.A00 = 0;
        obj6.A01 = "";
        A0C = obj6;
        ? obj7 = new Object();
        obj7.A00 = -1;
        obj7.A01 = "Service connection is disconnected.";
        A0D = obj7;
        ? obj8 = new Object();
        obj8.A00 = 2;
        obj8.A01 = "Timeout communicating with service.";
        A0E = obj8;
        ? obj9 = new Object();
        obj9.A00 = -2;
        obj9.A01 = "Client does not support subscriptions.";
        A0F = obj9;
        ? obj10 = new Object();
        obj10.A00 = 4;
        obj10.A01 = "Item is unavailable for purchase.";
        A00 = obj10;
        ? obj11 = new Object();
        obj11.A00 = 5;
        obj11.A01 = "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.";
        A01 = obj11;
    }
}
