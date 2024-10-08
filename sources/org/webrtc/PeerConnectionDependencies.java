package org.webrtc;

import org.webrtc.PeerConnection;

public final class PeerConnectionDependencies {
    public final PeerConnection.Observer observer;
    public final SSLCertificateVerifier sslCertificateVerifier;

    public class Builder {
        public PeerConnection.Observer observer;
        public SSLCertificateVerifier sslCertificateVerifier;

        public PeerConnectionDependencies createPeerConnectionDependencies() {
            return new PeerConnectionDependencies(this.observer, this.sslCertificateVerifier);
        }

        public Builder(PeerConnection.Observer observer2) {
            this.observer = observer2;
        }

        public Builder setSSLCertificateVerifier(SSLCertificateVerifier sSLCertificateVerifier) {
            this.sslCertificateVerifier = sSLCertificateVerifier;
            return this;
        }
    }

    public static Builder builder(PeerConnection.Observer observer2) {
        return new Builder(observer2);
    }

    public PeerConnectionDependencies(PeerConnection.Observer observer2, SSLCertificateVerifier sSLCertificateVerifier) {
        this.observer = observer2;
        this.sslCertificateVerifier = sSLCertificateVerifier;
    }

    public PeerConnection.Observer getObserver() {
        return this.observer;
    }

    public SSLCertificateVerifier getSSLCertificateVerifier() {
        return this.sslCertificateVerifier;
    }
}
