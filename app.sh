#!/bin/bash

TERM=dumb
exec ./gradlew -q run --args "app $@"
