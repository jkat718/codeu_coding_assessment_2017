// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.google.codeu.codingchallenge;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

final class MyJSON implements JSON {

    private final HashMap<String, JSON> objectChildren = new HashMap<>();
    private final HashMap<String, String> stringChildren = new HashMap<>();

    @Override
    public JSON getObject(String name) {
        return this.objectChildren.get(name);
    }

    @Override
    public JSON setObject(String name, JSON value) {
        this.objectChildren.put(name, value);
        return this;
    }

    @Override
    public String getString(String name) {
        return this.stringChildren.get(name);
    }

    @Override
    public JSON setString(String name, String value) {
        this.stringChildren.put(name, value);
        return this;
    }

    @Override
    public void getObjects(Collection<String> names) {
        names.addAll(this.objectChildren.keySet());
    }

    @Override
    public void getStrings(Collection<String> names) {
        names.addAll(this.stringChildren.keySet());
    }
}
