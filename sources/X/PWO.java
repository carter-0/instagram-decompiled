package X;

import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

public final class PWO implements Runnable {
    public final /* synthetic */ StellaIpcDirectMessagingServiceClient A00;

    public PWO(StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient) {
        this.A00 = stellaIpcDirectMessagingServiceClient;
    }

    public final void run() {
        this.A00.disconnect();
    }
}
