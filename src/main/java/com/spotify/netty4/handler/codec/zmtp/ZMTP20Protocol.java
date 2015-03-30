/*
* Copyright (c) 2012-2015 Spotify AB
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/

package com.spotify.netty4.handler.codec.zmtp;

public class ZMTP20Protocol implements ZMTPProtocol {

  @Override
  public ZMTPHandshaker handshaker(final ZMTPConfig config) {
    return new ZMTP20Handshaker(config.socketType(), config.interop(), config.localIdentity());
  }

  @Override
  public ZMTPVersion version() {
    return ZMTPVersion.ZMTP20;
  }
}
