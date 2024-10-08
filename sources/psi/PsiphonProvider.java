package psi;

public interface PsiphonProvider extends PsiphonProviderNetwork, PsiphonProviderNoticeHandler {
    String bindToDevice(long j);

    String getDNSServersAsString();

    String getNetworkID();

    long hasIPv6Route();

    long hasNetworkConnectivity();

    String iPv6Synthesize(String str);

    void notice(String str);
}
